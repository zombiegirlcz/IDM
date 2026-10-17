package ivc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f168820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f168821b;

    public a(b cardMapper, m secureAccountExpandableRowCellMapper) {
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(secureAccountExpandableRowCellMapper, "secureAccountExpandableRowCellMapper");
        this.f168820a = cardMapper;
        this.f168821b = secureAccountExpandableRowCellMapper;
    }
}
