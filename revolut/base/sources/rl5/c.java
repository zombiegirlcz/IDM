package rl5;

import com.revolut.feature.crypto.spare.change.impl.data.service.CryptoSpareChangeService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSpareChangeService f254918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql5.a f254919b;

    public c(CryptoSpareChangeService service, ql5.a cryptoSpareChangeDetailsMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeDetailsMapper, "cryptoSpareChangeDetailsMapper");
        this.f254918a = service;
        this.f254919b = cryptoSpareChangeDetailsMapper;
    }
}
