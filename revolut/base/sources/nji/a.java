package nji;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final View a(com.revolut.kompot.navigable.a aVar) {
        if (aVar == null) {
            return null;
        }
        return (aVar.D2().getWidth() == 0 || aVar.D2().getHeight() == 0) ? a(aVar.f98405m) : aVar.D2();
    }

    public static final boolean b(com.revolut.kompot.navigable.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return !(aVar instanceof qji.c);
    }
}
