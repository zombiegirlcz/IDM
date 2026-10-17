package a80;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.Spannable;
import ce9.m;
import com.revolut.core.ui_kit.keyboard.ui.R$dimen;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements zk0.c, xql.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1989c;

    public /* synthetic */ e(Object obj2, int i, int i2) {
        this.f1987a = i2;
        this.f1989c = obj2;
        this.f1988b = i;
    }

    @Override // xql.a
    public void a(SharedPreferences prefs) {
        int i = this.f1988b;
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        ReentrantLock reentrantLock = (ReentrantLock) this.f1989c;
        reentrantLock.lock();
        try {
            if (prefs.getInt("file_version", 1) != i) {
                prefs.edit().clear().putInt("file_version", i).commit();
            }
            Unit unit = Unit.f186387a;
            reentrantLock.unlock();
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    public void b(mmm.f node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i = this.f1988b + 1;
        this.f1988b = i;
        mmm.f[] fVarArr = (mmm.f[]) this.f1989c;
        if (i == fVarArr.length) {
            mmm.f[] fVarArr2 = new mmm.f[i * 2];
            p.l(fVarArr, fVarArr2, 0, 0, 14);
            this.f1989c = fVarArr2;
        }
        l(i, node);
    }

    public boolean c() {
        int i = this.f1988b;
        int i2 = ((jm.a) this.f1989c).f175890a;
        if (i > i2) {
            return i == 0 && i2 == 0;
        }
        return true;
    }

    public void d(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f1989c;
        if (cArr.length <= i3) {
            int i5 = i * 2;
            if (i3 < i5) {
                i3 = i5;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f1989c = cArrCopyOf;
        }
    }

    public mmm.f e() {
        return ((mmm.f[]) this.f1989c)[1];
    }

    public int f() {
        return this.f1988b;
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        w01.e eVar = (w01.e) this.f1989c;
        try {
            m.h(this.f1988b, eVar.f293610a).compress(w01.e.f293609c, 100, outputStream);
            outputStream.close();
        } finally {
        }
    }

    public IntRange h() {
        return (IntRange) this.f1989c;
    }

    public int i() {
        return this.f1988b;
    }

    public KotlinType j() {
        return (KotlinType) this.f1989c;
    }

    public boolean k() {
        return ((r7.a) this.f1989c) != null;
    }

    public void l(int i, mmm.f fVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            mmm.f fVar2 = ((mmm.f[]) this.f1989c)[i2];
            Intrinsics.h(fVar2);
            if (Intrinsics.l(0L, fVar.f207262g - fVar2.f207262g) <= 0) {
                break;
            }
            fVar2.f = i;
            ((mmm.f[]) this.f1989c)[i] = fVar2;
            i = i2;
        }
        ((mmm.f[]) this.f1989c)[i] = fVar;
        fVar.f = i;
    }

    public Character m() {
        int i = this.f1988b;
        jm.a aVar = (jm.a) this.f1989c;
        if (i >= aVar.f175891b.length()) {
            return null;
        }
        String str = aVar.f175891b;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        char[] charArray = str.toCharArray();
        Intrinsics.g(charArray, "(this as java.lang.String).toCharArray()");
        int i2 = this.f1988b;
        char c2 = charArray[i2];
        this.f1988b = i2 + 1;
        return Character.valueOf(c2);
    }

    public void n() {
        slm.h hVar = slm.h.f264263c;
        char[] array = (char[]) this.f1989c;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        hVar.a(array);
    }

    public void o(mmm.f node) {
        mmm.f fVar;
        Intrinsics.checkNotNullParameter(node, "node");
        int i = node.f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.f1988b;
        mmm.f fVar2 = ((mmm.f[]) this.f1989c)[i2];
        Intrinsics.h(fVar2);
        node.f = -1;
        ((mmm.f[]) this.f1989c)[i2] = null;
        this.f1988b = i2 - 1;
        if (node == fVar2) {
            return;
        }
        int iL = Intrinsics.l(0L, fVar2.f207262g - node.f207262g);
        if (iL == 0) {
            ((mmm.f[]) this.f1989c)[i] = fVar2;
            fVar2.f = i;
            return;
        }
        if (iL >= 0) {
            l(i, fVar2);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i5 = i3 + 1;
            int i6 = this.f1988b;
            if (i5 > i6) {
                if (i3 > i6) {
                    break;
                }
                fVar = ((mmm.f[]) this.f1989c)[i3];
                Intrinsics.h(fVar);
            } else {
                fVar = ((mmm.f[]) this.f1989c)[i3];
                Intrinsics.h(fVar);
                mmm.f fVar3 = ((mmm.f[]) this.f1989c)[i5];
                Intrinsics.h(fVar3);
                if (Intrinsics.l(0L, fVar3.f207262g - fVar.f207262g) >= 0) {
                    fVar = fVar3;
                }
            }
            if (Intrinsics.l(0L, fVar.f207262g - fVar2.f207262g) <= 0) {
                break;
            }
            int i21 = fVar.f;
            fVar.f = i;
            ((mmm.f[]) this.f1989c)[i] = fVar;
            i = i21;
        }
        ((mmm.f[]) this.f1989c)[i] = fVar2;
        fVar2.f = i;
    }

    public void p() {
        this.f1988b = 255;
        this.f1989c = null;
    }

    public void q(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        d(this.f1988b, length);
        text.getChars(0, text.length(), (char[]) this.f1989c, this.f1988b);
        this.f1988b += length;
    }

    public String toString() {
        switch (this.f1987a) {
            case 7:
                return new String((char[]) this.f1989c, 0, this.f1988b);
            default:
                return super.toString();
        }
    }

    public e(int i) {
        this.f1987a = 10;
        this.f1988b = i;
        this.f1989c = new ReentrantLock();
    }

    public e(Activity activity) {
        this.f1987a = 8;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f1989c = activity;
        this.f1988b = activity.getResources().getDimensionPixelSize(R$dimen.internal_keyboard_min_height);
    }

    public e(jm.a aVar) {
        this.f1987a = 3;
        this.f1989c = aVar;
        this.f1988b = 0;
    }

    public e(Spannable text, int i) {
        this.f1987a = 1;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f1989c = text;
        this.f1988b = i;
    }

    public e(int i, b9.e[] eVarArr) {
        this.f1987a = 2;
        this.f1988b = i;
        this.f1989c = eVarArr;
    }

    public e(int i, byte b4) {
        this.f1987a = i;
        switch (i) {
            case 5:
                p();
                break;
            case 6:
            default:
                this.f1989c = new mmm.f[8];
                break;
            case 7:
                this.f1989c = slm.h.f264263c.b(128);
                break;
        }
    }

    public e(int i, IntRange matchRange) {
        this.f1987a = 0;
        Intrinsics.checkNotNullParameter(matchRange, "matchRange");
        this.f1988b = i;
        this.f1989c = matchRange;
    }
}
