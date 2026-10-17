package qkc;

import com.revolut.feature.rfi_tool.impl.data.service.RfiToolService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RfiToolService f246978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pkc.a f246979b;

    public a(RfiToolService service, pkc.a rfiToolMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(rfiToolMapper, "rfiToolMapper");
        this.f246978a = service;
        this.f246979b = rfiToolMapper;
    }
}
