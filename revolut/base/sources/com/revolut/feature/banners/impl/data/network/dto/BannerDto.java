package com.revolut.feature.banners.impl.data.network.dto;

import j6.a;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto;", "", "<init>", "()V", "Companion", "SingleCta", "NoCta", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$NoCta;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public abstract class BannerDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f64102a = j.c(k.PUBLICATION, new rm0.k(23));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) BannerDto.f64102a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$NoCta;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto;", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class NoCta extends BannerDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64104c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f64105g;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$NoCta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$NoCta;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerDto$NoCta$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ NoCta(int i, String str, int i2, String str2, String str3, String str4, boolean z) {
            if (43 != (i & 43)) {
                j1.f(BannerDto$NoCta$$serializer.INSTANCE.getDescriptor(), i, 43);
                throw null;
            }
            this.f64103b = str;
            this.f64104c = i2;
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            this.e = str3;
            if ((i & 16) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            this.f64105g = z;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NoCta)) {
                return false;
            }
            NoCta noCta = (NoCta) obj2;
            return Intrinsics.f(this.f64103b, noCta.f64103b) && this.f64104c == noCta.f64104c && Intrinsics.f(this.d, noCta.d) && Intrinsics.f(this.e, noCta.e) && Intrinsics.f(this.f, noCta.f) && this.f64105g == noCta.f64105g;
        }

        public final int hashCode() {
            int iB = a.b(this.f64104c, this.f64103b.hashCode() * 31, 31);
            String str = this.d;
            int iC = p.a.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            return Boolean.hashCode(this.f64105g) + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto;", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class SingleCta extends BannerDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] i = {null, null, null, null, null, null, j.c(k.PUBLICATION, new rm0.k(24))};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64106b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64107c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f64108g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BannerActionDto f64109h;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerDto$SingleCta;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerDto$SingleCta$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SingleCta(int i2, String str, int i3, String str2, String str3, String str4, boolean z, BannerActionDto bannerActionDto) {
            if (107 != (i2 & 107)) {
                j1.f(BannerDto$SingleCta$$serializer.INSTANCE.getDescriptor(), i2, 107);
                throw null;
            }
            this.f64106b = str;
            this.f64107c = i3;
            if ((i2 & 4) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            this.e = str3;
            if ((i2 & 16) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
            this.f64108g = z;
            this.f64109h = bannerActionDto;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleCta)) {
                return false;
            }
            SingleCta singleCta = (SingleCta) obj2;
            return Intrinsics.f(this.f64106b, singleCta.f64106b) && this.f64107c == singleCta.f64107c && Intrinsics.f(this.d, singleCta.d) && Intrinsics.f(this.e, singleCta.e) && Intrinsics.f(this.f, singleCta.f) && this.f64108g == singleCta.f64108g && Intrinsics.f(this.f64109h, singleCta.f64109h);
        }

        public final int hashCode() {
            int iB = a.b(this.f64107c, this.f64106b.hashCode() * 31, 31);
            String str = this.d;
            int iC = p.a.c((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            return this.f64109h.hashCode() + a.c((iC + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f64108g);
        }
    }

    private BannerDto() {
    }
}
