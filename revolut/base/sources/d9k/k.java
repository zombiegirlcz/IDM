package d9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f112411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f112412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f112413c;

    public k(l personalAccountMapper, n subaccountMapper, m splitBillLinkMapper) {
        Intrinsics.checkNotNullParameter(personalAccountMapper, "personalAccountMapper");
        Intrinsics.checkNotNullParameter(subaccountMapper, "subaccountMapper");
        Intrinsics.checkNotNullParameter(splitBillLinkMapper, "splitBillLinkMapper");
        this.f112411a = personalAccountMapper;
        this.f112412b = subaccountMapper;
        this.f112413c = splitBillLinkMapper;
    }
}
