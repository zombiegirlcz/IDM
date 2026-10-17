package com.revolut.feature.restricted_access;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import ff4.z;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import sri.m;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f82032b;

    public /* synthetic */ d(h hVar, int i) {
        this.f82031a = i;
        this.f82032b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f82031a;
        h hVar = this.f82032b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (hVar.u.compareAndSet(false, true)) {
                    fkl.h hVar2 = hVar.f82037l;
                    CoroutineScope coroutineScope = hVar2.f135868b;
                    p0 p0Var = p0.f264001a;
                    e0.C(coroutineScope, elm.f.f127540b, null, new z(hVar2, null, 15), 2);
                    hVar.N();
                }
                break;
            case 1:
                NaviCommand naviCommand = (NaviCommand) obj2;
                m mVar = hVar.i;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                ((kz0.a) hVar.f82043s.getValue()).dismiss();
                break;
            default:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "LogoutGuardian", "Logout failed: " + th10 + ", restarting the app", th10, h0Var);
                hVar.i.c(RestartApplicationCommand.f98667a);
                break;
        }
        return Unit.f186387a;
    }
}
