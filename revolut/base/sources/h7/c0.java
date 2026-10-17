package h7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c0 extends s7.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f149768c;

    public c0(Function1 function1) {
        this.f149768c = function1;
    }

    @Override // s7.c
    public final Object a(s7.b frameInfo) {
        Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
        return ((d0) this.f149768c).invoke(frameInfo);
    }
}
