package e8;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f123431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f123432b = true;

    public a0(Appendable appendable) {
        this.f123431a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) throws IOException {
        boolean z = this.f123432b;
        Appendable appendable = this.f123431a;
        if (z) {
            this.f123432b = false;
            appendable.append("  ");
        }
        this.f123432b = c2 == '\n';
        appendable.append(c2);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f123432b;
        Appendable appendable = this.f123431a;
        boolean z3 = false;
        if (z) {
            this.f123432b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z3 = true;
        }
        this.f123432b = z3;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
