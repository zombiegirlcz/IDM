package vyi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxi.f f293347a;

    public s(hxi.f loungeListItemBuilder) {
        Intrinsics.checkNotNullParameter(loungeListItemBuilder, "loungeListItemBuilder");
        this.f293347a = loungeListItemBuilder;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f293335a, new vw4.j(this, 26), new vv7.l(16), new vh2.o(this, domainState, 10)));
    }
}
