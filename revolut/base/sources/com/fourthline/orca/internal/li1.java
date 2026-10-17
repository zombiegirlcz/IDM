package com.fourthline.orca.internal;

import android.net.Uri;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.focus.FocusState;
import androidx.view.result.ActivityResult;
import com.fourthline.orca.internal.tr0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class li1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f30636b;

    public /* synthetic */ li1(int i, Function1 function1) {
        this.f30635a = i;
        this.f30636b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f30635a) {
            case 0:
                return a30.a(this.f30636b, (FocusState) obj2);
            case 1:
                return c91.a(this.f30636b, (kd1) obj2);
            case 2:
                return c91.b(this.f30636b, (kd1) obj2);
            case 3:
                return c91.a(this.f30636b, ((Boolean) obj2).booleanValue());
            case 4:
                return c91.a(this.f30636b, (String) obj2);
            case 5:
                return d70.a(this.f30636b, (ActivityResult) obj2);
            case 6:
                return d70.b(this.f30636b, (ActivityResult) obj2);
            case 7:
                return d70.a(this.f30636b, (DisposableEffectScope) obj2);
            case 8:
                return d70.a(this.f30636b, (kd1) obj2);
            case 9:
                return d70.b(this.f30636b, (kd1) obj2);
            case 10:
                return dp0.a(this.f30636b, (Uri) obj2);
            case 11:
                return dp0.b(this.f30636b, (Uri) obj2);
            case 12:
                return dp0.a(this.f30636b, (fb1) obj2);
            case 13:
                return ds0.a(this.f30636b, ((Boolean) obj2).booleanValue());
            case 14:
                return ds0.a(this.f30636b, (kd1) obj2);
            case 15:
                return ds0.b(this.f30636b, (kd1) obj2);
            case 16:
                return ds0.a(this.f30636b, (tr0.a.InterfaceC0287a.C0288a) obj2);
            case 17:
                return ds0.a(this.f30636b, (tr0.a.InterfaceC0287a) obj2);
            case 18:
                return fz.a(this.f30636b, (kd1) obj2);
            case 19:
                return fz.b(this.f30636b, (kd1) obj2);
            case 20:
                return g9.a(this.f30636b, (String) obj2);
            case 21:
                return gn.a(this.f30636b, (kd1) obj2);
            case 22:
                return gn.b(this.f30636b, (kd1) obj2);
            case 23:
                return hi0.a(this.f30636b, (kd1) obj2);
            case 24:
                return hm.a(this.f30636b, ((Boolean) obj2).booleanValue());
            case 25:
                return hm.a(this.f30636b, (String) obj2);
            case 26:
                return hm.a(this.f30636b, (a01) obj2);
            case 27:
                return hm.b(this.f30636b, ((Boolean) obj2).booleanValue());
            case 28:
                return hm.b(this.f30636b, (String) obj2);
            default:
                return hm.a(this.f30636b, (kd1) obj2);
        }
    }
}
