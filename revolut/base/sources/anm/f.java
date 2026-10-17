package anm;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7831b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f7832c = new HashSet();
    public final int d;
    public final int e;

    public f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f7831b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f7832c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // anm.b
    public final int a(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f7832c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.e;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.d) {
            String str = (String) this.f7831b.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
