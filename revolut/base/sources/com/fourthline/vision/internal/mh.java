package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.tooling.PreviewActivity;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36586c;

    public /* synthetic */ mh(Object obj2, Object obj3, int i) {
        this.f36584a = i;
        this.f36585b = obj2;
        this.f36586c = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iS;
        int i = this.f36584a;
        Object obj2 = this.f36586c;
        Object obj3 = this.f36585b;
        switch (i) {
            case 0:
                return vf.overlayContainer_delegate$lambda$0((Context) obj3, (vf) obj2);
            case 1:
                return PreviewActivity.setParameterizedContent$lambda$0$1$0$0((MutableIntState) obj3, (Object[]) obj2);
            case 2:
                kem.q0 q0Var = (kem.q0) obj2;
                String str = q0Var.f;
                if (((ArrayList) obj3).isEmpty() || (iS = kotlin.text.d0.S(str, '/', q0Var.i.f183217a.length() + 3, 4)) == -1) {
                    return "";
                }
                int iU = kotlin.text.d0.U(str, new char[]{'?', '#'}, iS, false);
                if (iU == -1) {
                    String strSubstring = str.substring(iS);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(iS, iU);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return strSubstring2;
            default:
                return (io.ktor.utils.io.m) io.ktor.utils.io.k0.d(skm.b1.f263958a, (CoroutineContext) obj3, new ydm.b((nem.c) obj2, null), 2).f139730b;
        }
    }
}
