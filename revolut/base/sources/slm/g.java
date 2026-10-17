package slm;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f264260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f264261b;

    public g(int i) {
        switch (i) {
            case 1:
                this.f264260a = new ArrayDeque();
                break;
            default:
                this.f264260a = new ArrayDeque();
                break;
        }
    }

    public void a(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int i = this.f264261b;
                if (array.length + i < e.f264252a) {
                    this.f264261b = i + array.length;
                    this.f264260a.addLast(array);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            ArrayDeque arrayDeque = this.f264260a;
            cArr = null;
            char[] cArr2 = (char[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
            if (cArr2 != null) {
                this.f264261b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
