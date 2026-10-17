package lge;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements pfe.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f195106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductSpaceIdentifier f195107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f195108c;

    public k(Clause clause, ProductSpaceIdentifier spaceIdentifier, List subSpaces) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaces, "subSpaces");
        this.f195106a = clause;
        this.f195107b = spaceIdentifier;
        this.f195108c = subSpaces;
    }

    @Override // pfe.h
    public final Flow a() {
        return new go.g(u.c(new vfe.a(this.f195106a, this.f195107b, this.f195108c)), 2);
    }
}
