package wjh;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements bih.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dlc.b f298121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f298123c;
    public final WealthAccount.Robo d;
    public final List e;
    public final f0 f;

    public w(dlc.b content, boolean z, int i, WealthAccount.Robo account, List accountActions) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(accountActions, "accountActions");
        this.f298121a = content;
        this.f298122b = z;
        this.f298123c = i;
        this.d = account;
        this.e = accountActions;
        this.f = f0.f322471a;
    }

    @Override // bih.m
    public final List a() {
        return this.f;
    }

    @Override // bih.m
    public final AnimationRequest b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f298121a, wVar.f298121a) && this.f298122b == wVar.f298122b && this.f298123c == wVar.f298123c && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e);
    }

    @Override // bih.m
    public final int getOrder() {
        return this.f298123c;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.b(this.f298123c, j6.a.c(this.f298121a.hashCode() * 31, 31, this.f298122b), 31)) * 31);
    }
}
