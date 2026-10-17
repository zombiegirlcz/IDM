package eu7;

import bu7.c0;
import bu7.d0;
import bu7.f0;
import bu7.g0;
import bu7.y0;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import hu7.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f129531a;

    public e(j detailRepository) {
        Intrinsics.checkNotNullParameter(detailRepository, "detailRepository");
        this.f129531a = detailRepository;
    }

    public static g0 a(RemoteDocument remoteDocument, c0 c0Var, boolean z) {
        y0 y0Var = remoteDocument.f75845b;
        String str = remoteDocument.f75844a;
        int i = d.f129530a[y0Var.ordinal()];
        if (i == 1) {
            return new d0(c0Var, str, z);
        }
        if (i == 2) {
            return new f0(c0Var, str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
