package v9;

import com.google.common.primitives.UnsignedBytes;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
public final class l0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f286918c;

    public l0(int i, Class cls) {
        super(cls, 0);
        this.f286918c = i;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        String strValueOf;
        switch (this.f286918c) {
            case 1:
                Date date = (Date) obj2;
                vVar.getClass();
                if (!vVar.f182201a.n(k9.u.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                    hVar.o(vVar.d().format(date));
                } else {
                    hVar.o(String.valueOf(date.getTime()));
                }
                break;
            case 2:
                long timeInMillis = ((Calendar) obj2).getTimeInMillis();
                vVar.getClass();
                if (!vVar.f182201a.n(k9.u.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
                    hVar.o(vVar.d().format(new Date(timeInMillis)));
                } else {
                    hVar.o(String.valueOf(timeInMillis));
                }
                break;
            case 3:
                hVar.o(((Class) obj2).getName());
                break;
            case 4:
                if (vVar.f182201a.n(k9.u.WRITE_ENUMS_USING_TO_STRING)) {
                    strValueOf = obj2.toString();
                } else {
                    Enum r122 = (Enum) obj2;
                    strValueOf = vVar.f182201a.n(k9.u.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r122.ordinal()) : r122.name();
                }
                hVar.o(strValueOf);
                break;
            case 5:
            case 6:
                long jLongValue = ((Number) obj2).longValue();
                hVar.getClass();
                hVar.o(Long.toString(jLongValue));
                break;
            case 7:
                com.fasterxml.jackson.core.b bVar = vVar.f182201a.f203599b.f203593g;
                byte[] bArr = (byte[]) obj2;
                char[] cArr = bVar.f26160b;
                int i = bVar.f;
                int length = bArr.length;
                StringBuilder sb6 = new StringBuilder((length >> 2) + length + (length >> 3));
                int i2 = i >> 2;
                int i3 = length - 3;
                int i5 = 0;
                while (true) {
                    int i6 = i2;
                    while (i5 <= i3) {
                        int i21 = i5 + 2;
                        int i22 = ((bArr[i5 + 1] & UnsignedBytes.MAX_VALUE) | (bArr[i5] << 8)) << 8;
                        i5 += 3;
                        int i32 = i22 | (bArr[i21] & UnsignedBytes.MAX_VALUE);
                        sb6.append(cArr[(i32 >> 18) & 63]);
                        sb6.append(cArr[(i32 >> 12) & 63]);
                        sb6.append(cArr[(i32 >> 6) & 63]);
                        sb6.append(cArr[i32 & 63]);
                        i6--;
                        if (i6 <= 0) {
                        }
                        break;
                    }
                    int i33 = length - i5;
                    if (i33 > 0) {
                        int i43 = i5 + 1;
                        int i59 = bArr[i5] << 16;
                        if (i33 == 2) {
                            i59 |= (bArr[i43] & UnsignedBytes.MAX_VALUE) << 8;
                        }
                        char c2 = bVar.e;
                        sb6.append(cArr[(i59 >> 18) & 63]);
                        sb6.append(cArr[(i59 >> 12) & 63]);
                        if (bVar.f26162g) {
                            sb6.append(i33 == 2 ? cArr[(i59 >> 6) & 63] : c2);
                            sb6.append(c2);
                        } else if (i33 == 2) {
                            sb6.append(cArr[(i59 >> 6) & 63]);
                        }
                    }
                    hVar.o(sb6.toString());
                    sb6.append("\\n");
                }
                break;
            default:
                hVar.o(obj2.toString());
                break;
        }
    }
}
