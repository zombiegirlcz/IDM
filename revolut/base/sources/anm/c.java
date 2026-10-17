package anm;

import java.io.StringWriter;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c extends b {
    @Override // anm.b
    public final int a(CharSequence charSequence, int i, StringWriter stringWriter) {
        return b(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }

    public abstract boolean b(int i, StringWriter stringWriter);
}
