package mh1;

import g48.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f205369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f205370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.a f205371c;

    public n(fk3.a configurationInteractor, r0 jointAccountsInteractor, gr6.a freelancerAccountDetailsInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        this.f205369a = configurationInteractor;
        this.f205370b = jointAccountsInteractor;
        this.f205371c = freelancerAccountDetailsInteractor;
    }

    public static final Set a(n nVar, ArrayList arrayList) {
        nVar.getClass();
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((xi0.b) it8.next()).f306286a);
        }
        return d0.i1(arrayList2);
    }
}
