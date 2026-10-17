package com.revolut.uicomponent.products;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uyh.s;
import uyl.r;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/uicomponent/products/SpaceDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/uicomponent/products/SpaceDelegate$a;", "Luyl/r;", "<init>", "()V", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class SpaceDelegate extends BaseRecyclerViewDelegate<a, r> {

    public static final class a implements j, o31.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p31.c f107216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p31.c f107217b;

        public a() {
            Intrinsics.checkNotNullParameter("", "listId");
            this.f107216a = null;
            this.f107217b = null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF54213a() {
            return "";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f107216a, aVar.f107216a) && Intrinsics.f(this.f107217b, aVar.f107217b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(0) * 923521;
            p31.c cVar = this.f107216a;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f107217b;
            return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i */
        public final p31.c getF52787l() {
            return this.f107216a;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k */
        public final p31.c getI() {
            return this.f107217b;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q */
        public final p31.c getK() {
            return null;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r */
        public final p31.c getF52786j() {
            return null;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f107216a = cVar;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f107217b = cVar;
        }
    }

    public SpaceDelegate() {
        super(R$layout.delegate_space, new s(6));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(r holder, a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        data.getClass();
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
    }
}
