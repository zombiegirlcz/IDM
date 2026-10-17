package com.fourthline.orca.internal;

import android.location.Location;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class bi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27139a;

    public /* synthetic */ bi1(int i) {
        this.f27139a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f27139a) {
            case 0:
                return a30.a(((Boolean) obj2).booleanValue());
            case 1:
                return a30.a((String) obj2);
            case 2:
                return a30.c(((Boolean) obj2).booleanValue());
            case 3:
                return a30.c((String) obj2);
            case 4:
                return a30.b(((Boolean) obj2).booleanValue());
            case 5:
                return a30.b((String) obj2);
            case 6:
                return a30.d(((Boolean) obj2).booleanValue());
            case 7:
                return a30.d((String) obj2);
            case 8:
                return a80.a((SemanticsPropertyReceiver) obj2);
            case 9:
                return a80.b((SemanticsPropertyReceiver) obj2);
            case 10:
                return ah0.b(((Integer) obj2).intValue());
            case 11:
                return ah0.a(((Integer) obj2).intValue());
            case 12:
                return ax0.a((rw0) obj2);
            case 13:
                return ax0.c((rw0) obj2);
            case 14:
                return ax0.b((rw0) obj2);
            case 15:
                return c40.a((GraphicsLayerScope) obj2);
            case 16:
                return d91.a((v81) obj2);
            case 17:
                return da.b((gq0) obj2);
            case 18:
                return dh.a((tg) obj2);
            case 19:
                return e70.a((b70) obj2);
            case 20:
                return ei0.a((olm.a) obj2);
            case 21:
                return es0.a((tr0) obj2);
            case 22:
                return Boolean.valueOf(f00.a((Location) obj2));
            case 23:
                return f6.a((olm.a) obj2);
            case 24:
                return fa.a((olm.a) obj2);
            case 25:
                return fi0.b((String) obj2);
            case 26:
                return fo0.a((bo0) obj2);
            case 27:
                return g50.c((c21) obj2);
            case 28:
                return g81.a(((Float) obj2).floatValue());
            default:
                return g9.a(((Boolean) obj2).booleanValue());
        }
    }
}
