package fs0;

import android.text.Spannable;
import java.text.CharacterIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements CharacterIterator, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spannable f137512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f137514c;

    public a(Spannable text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f137512a = text;
        this.f137513b = i;
        this.f137514c = 0;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object objClone = super.clone();
            Intrinsics.h(objClone);
            return objClone;
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone not supported", e);
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f137514c;
        if (i < 0 || i >= this.f137513b) {
            return (char) 65535;
        }
        return this.f137512a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f137514c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f137513b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f137514c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f137513b;
        if (i == 0) {
            this.f137514c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f137514c = i2;
        return this.f137512a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f137514c + 1;
        this.f137514c = i;
        int i2 = this.f137513b;
        if (i < i2) {
            return this.f137512a.charAt(i);
        }
        this.f137514c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f137514c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f137514c = i2;
        return this.f137512a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f137513b || i < 0) {
            throw new IllegalArgumentException(a0.d.n("Index out of bounds: ", i).toString());
        }
        this.f137514c = i;
        return current();
    }
}
