package com.revolut.feature.banners.impl.data.network.dto;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannersResponseDto;", "", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class BannersResponseDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f64110b = {j.c(k.PUBLICATION, new rm0.k(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64111a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannersResponseDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannersResponseDto;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return BannersResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannersResponseDto(int i, List list) {
        if (1 == (i & 1)) {
            this.f64111a = list;
        } else {
            j1.f(BannersResponseDto$$serializer.INSTANCE.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BannersResponseDto) && Intrinsics.f(this.f64111a, ((BannersResponseDto) obj2).f64111a);
    }

    public final int hashCode() {
        return this.f64111a.hashCode();
    }
}
