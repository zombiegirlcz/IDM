package com.revolut.feature.credit.impl.notifications.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/impl/notifications/data/e;", "", "", "toString", "()Ljava/lang/String;", "Lb25/a;", "a", "Lb25/a;", "()Lb25/a;", "dto", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("dto")
    private final b25.a dto;

    public e(b25.a aVar) {
        this.dto = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b25.a getDto() {
        return this.dto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.dto, ((e) obj2).dto);
    }

    public final int hashCode() {
        b25.a aVar = this.dto;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
