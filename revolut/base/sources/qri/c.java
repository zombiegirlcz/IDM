package qri;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import v60.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f248734a;

    public c() {
        i iVar = new i();
        Intrinsics.checkNotNullExpressionValue(iVar, "create(...)");
        this.f248734a = iVar;
    }

    public final void d(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        this.f248734a.onNext(naviCommand);
    }
}
