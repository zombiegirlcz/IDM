package org.ejbca.cvc;

import grl.b4;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes14.dex */
public class DateField extends AbstractDataField {
    private static final int DATE_ARRAY_SIZE = 6;
    private static final DateFormat FORMAT_PRINTABLE;
    private static final TimeZone GMTTIMEZONE;
    private static final long serialVersionUID = 6092901788235446614L;
    private Date date;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        GMTTIMEZONE = timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        FORMAT_PRINTABLE = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
    }

    public DateField(CVCTagEnum cVCTagEnum) {
        super(cVCTagEnum);
    }

    public Date getDate() {
        return this.date;
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public byte[] getEncoded() {
        Calendar calendar = Calendar.getInstance(GMTTIMEZONE);
        calendar.setTimeInMillis(this.date.getTime());
        int i = calendar.get(1) - 2000;
        int i2 = calendar.get(2) + 1;
        int i3 = calendar.get(5);
        return new byte[]{(byte) (i / 10), (byte) (i % 10), (byte) (i2 / 10), (byte) (i2 % 10), (byte) (i3 / 10), (byte) (i3 % 10)};
    }

    @Override // org.ejbca.cvc.AbstractDataField
    public String valueAsText() {
        return FORMAT_PRINTABLE.format(this.date);
    }

    public DateField(CVCTagEnum cVCTagEnum, Date date) {
        this(cVCTagEnum);
        Calendar calendar = Calendar.getInstance(GMTTIMEZONE);
        calendar.setTimeInMillis(date.getTime());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.clear();
        calendar.set(i, i2, i3);
        this.date = calendar.getTime();
    }

    public DateField(CVCTagEnum cVCTagEnum, byte[] bArr) {
        this(cVCTagEnum);
        if (bArr != null && bArr.length == 6) {
            int i = (bArr[0] * 10) + b4.EXPIRED_OR_INVALID_KEY_VALUE + bArr[1];
            int i2 = ((bArr[2] * 10) + bArr[3]) - 1;
            int i3 = (bArr[4] * 10) + bArr[5];
            Calendar calendar = Calendar.getInstance(GMTTIMEZONE);
            calendar.clear();
            if (cVCTagEnum == CVCTagEnum.EFFECTIVE_DATE) {
                calendar.set(i, i2, i3, 0, 0, 0);
            } else {
                calendar.set(i, i2, i3, 23, 59, 59);
            }
            this.date = calendar.getTime();
            return;
        }
        StringBuilder sb6 = new StringBuilder("data argument must have length 6, was ");
        sb6.append(bArr != null ? bArr.length : 0);
        throw new IllegalArgumentException(sb6.toString());
    }
}
