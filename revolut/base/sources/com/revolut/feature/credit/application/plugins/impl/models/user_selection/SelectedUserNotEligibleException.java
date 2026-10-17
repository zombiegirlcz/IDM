package com.revolut.feature.credit.application.plugins.impl.models.user_selection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p.a;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/models/user_selection/SelectedUserNotEligibleException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedUserNotEligibleException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66913c;

    public SelectedUserNotEligibleException(String title, String description, String buttonTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f66911a = title;
        this.f66912b = description;
        this.f66913c = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedUserNotEligibleException)) {
            return false;
        }
        SelectedUserNotEligibleException selectedUserNotEligibleException = (SelectedUserNotEligibleException) obj2;
        return Intrinsics.f(this.f66911a, selectedUserNotEligibleException.f66911a) && Intrinsics.f(this.f66912b, selectedUserNotEligibleException.f66912b) && Intrinsics.f(this.f66913c, selectedUserNotEligibleException.f66913c);
    }

    public final int hashCode() {
        return this.f66913c.hashCode() + a.c(this.f66911a.hashCode() * 31, 31, this.f66912b);
    }
}
