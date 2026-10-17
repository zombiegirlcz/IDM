package vz4;

import com.revolut.feature.credit.forbearance.application.api.models.ForbearanceApplicationPayload;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f293387b;

    public /* synthetic */ d(j jVar, int i) {
        this.f293386a = i;
        this.f293387b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f293386a) {
            case 0:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((m) this.f293387b.e).b0().b(((ForbearanceApplicationPayload) it8.c()).f69919a).ignoreElements();
            default:
                List content = (List) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content.isEmpty()) {
                    return pfm.m.f235744a;
                }
                lz4.a aVar = (lz4.a) d0.b0(content);
                m mVar = (m) this.f293387b.e;
                return mVar.d.getValue(mVar, m.f[1]).b(aVar.f200934a).ignoreElements();
        }
    }
}
