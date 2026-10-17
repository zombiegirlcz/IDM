package r38;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f251211a = new h();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i pendingInvitationOptional = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(pendingInvitationOptional, "pendingInvitationOptional");
        od0.i.Companion.getClass();
        return new Pair(pendingInvitationOptional, od0.i.f224256b);
    }
}
