package es0;

import com.revolut.core.ui_kit.views.DraggableTabsView;
import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128825a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128827c;
    public final Object d;

    public e(DraggableTabsView tabsView) {
        Intrinsics.checkNotNullParameter(tabsView, "tabsView");
        this.d = tabsView;
        this.f128826b = 0;
        this.f128827c = 0;
    }

    public byte a(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void b(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void c(int i, int i2, boolean z) {
        ((byte[][]) this.d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        switch (this.f128825a) {
            case 1:
                int i = this.f128826b;
                int i2 = this.f128827c;
                StringBuilder sb6 = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i5 = 0; i5 < i; i5++) {
                        byte b4 = bArr[i5];
                        if (b4 == 0) {
                            sb6.append(" 0");
                        } else if (b4 != 1) {
                            sb6.append("  ");
                        } else {
                            sb6.append(" 1");
                        }
                    }
                    sb6.append('\n');
                }
                return sb6.toString();
            default:
                return super.toString();
        }
    }

    public e(int i, int i2) {
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f128826b = i;
        this.f128827c = i2;
    }

    public e(byte[] bArr, int i, int i2) {
        this.d = bArr;
        this.f128826b = i;
        this.f128827c = i2;
    }
}
