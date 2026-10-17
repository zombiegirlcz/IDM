package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.LoginActionFooterView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.aw;
import ip0.fv;
import ip0.yv;
import ip0.zv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LoginActionFooterDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/yv;", "Lip0/aw;", "<init>", "()V", "ip0/zv", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoginActionFooterDelegate extends BaseRecyclerViewDelegate<yv, aw> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52752c;

    public LoginActionFooterDelegate() {
        super(R$layout.internal_delegate_login_action_footer, new fv(3));
        this.f52752c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new aw(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_login_action_footer));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(aw holder, yv data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        LoginActionFooterView loginActionFooterView = holder.f;
        ArrayList<zv> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            zv zvVar = obj2 instanceof zv ? (zv) obj2 : null;
            if (zvVar != null) {
                arrayList.add(zvVar);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = arrayList.isEmpty();
        for (zv zvVar2 : arrayList) {
            zIsEmpty = zIsEmpty || zvVar2.f167541a;
            zIsEmpty2 = zIsEmpty2 || zvVar2.f167542b;
        }
        if (zIsEmpty || zIsEmpty2) {
            loginActionFooterView.setFooterState(data.f167358a, data.f167359b);
        }
        this.f52752c.a(loginActionFooterView.f58761b, holder);
    }
}
