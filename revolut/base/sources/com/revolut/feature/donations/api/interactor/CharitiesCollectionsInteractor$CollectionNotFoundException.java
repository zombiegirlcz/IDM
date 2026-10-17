package com.revolut.feature.donations.api.interactor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m70.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/revolut/feature/donations/api/interactor/CharitiesCollectionsInteractor$CollectionNotFoundException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_donations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharitiesCollectionsInteractor$CollectionNotFoundException extends RuntimeException {
    public CharitiesCollectionsInteractor$CollectionNotFoundException() {
        this(3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CharitiesCollectionsInteractor$CollectionNotFoundException(int i) {
        String message;
        if ((i & 1) != 0) {
            a.c(t0.f186434a);
            message = "";
        } else {
            message = "No matching charities in charities list";
        }
        Intrinsics.checkNotNullParameter(message, "message");
        super(message, null);
    }
}
