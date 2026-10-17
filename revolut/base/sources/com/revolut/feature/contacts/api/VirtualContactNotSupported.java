package com.revolut.feature.contacts.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/VirtualContactNotSupported;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VirtualContactNotSupported extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final VirtualContactNotSupported f65969a = new VirtualContactNotSupported();

    private VirtualContactNotSupported() {
        super("VirtualContact not supported");
    }
}
