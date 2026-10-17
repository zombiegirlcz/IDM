package com.revolut.feature.banners.impl.data.network.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto;", "", "<init>", "()V", "Companion", "Uri", "ContentHtml", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$Uri;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public abstract class BannerActionDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f64095a = j.c(k.PUBLICATION, new rm0.k(22));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) BannerActionDto.f64095a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto;", "", "toString", "()Ljava/lang/String;", "Companion", "Link", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class ContentHtml extends BannerActionDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64097c;
        public final String d;
        public final Link e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerActionDto$ContentHtml$$serializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml$Link;", "", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Link {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64098a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64099b;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml$Link$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$ContentHtml$Link;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return BannerActionDto$ContentHtml$Link$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Link(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    j1.f(BannerActionDto$ContentHtml$Link$$serializer.INSTANCE.getDescriptor(), i, 3);
                    throw null;
                }
                this.f64098a = str;
                this.f64099b = str2;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Link)) {
                    return false;
                }
                Link link = (Link) obj2;
                return Intrinsics.f(this.f64098a, link.f64098a) && Intrinsics.f(this.f64099b, link.f64099b);
            }

            public final int hashCode() {
                return this.f64099b.hashCode() + (this.f64098a.hashCode() * 31);
            }
        }

        public /* synthetic */ ContentHtml(int i, String str, String str2, String str3, Link link) {
            if (7 != (i & 7)) {
                j1.f(BannerActionDto$ContentHtml$$serializer.INSTANCE.getDescriptor(), i, 7);
                throw null;
            }
            this.f64096b = str;
            this.f64097c = str2;
            this.d = str3;
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = link;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContentHtml)) {
                return false;
            }
            ContentHtml contentHtml = (ContentHtml) obj2;
            return Intrinsics.f(this.f64096b, contentHtml.f64096b) && Intrinsics.f(this.f64097c, contentHtml.f64097c) && Intrinsics.f(this.d, contentHtml.d) && Intrinsics.f(this.e, contentHtml.e);
        }

        public final int hashCode() {
            int iC = a.c(a.c(this.f64096b.hashCode() * 31, 31, this.f64097c), 31, this.d);
            Link link = this.e;
            return iC + (link == null ? 0 : link.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$Uri;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto;", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Uri extends BannerActionDto {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64101c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$Uri$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannerActionDto$Uri;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerActionDto$Uri$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Uri(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(BannerActionDto$Uri$$serializer.INSTANCE.getDescriptor(), i, 7);
                throw null;
            }
            this.f64100b = str;
            this.f64101c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Uri)) {
                return false;
            }
            Uri uri2 = (Uri) obj2;
            return Intrinsics.f(this.f64100b, uri2.f64100b) && Intrinsics.f(this.f64101c, uri2.f64101c) && Intrinsics.f(this.d, uri2.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + a.c(this.f64100b.hashCode() * 31, 31, this.f64101c);
        }
    }

    private BannerActionDto() {
    }
}
