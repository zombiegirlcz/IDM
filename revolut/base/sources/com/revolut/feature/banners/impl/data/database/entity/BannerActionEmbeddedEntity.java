package com.revolut.feature.banners.impl.data.database.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import pni.a;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity;", "", "<init>", "()V", "Companion", "Uri", "ContentHtml", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$Uri;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public abstract class BannerActionEmbeddedEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f64088a = j.c(k.PUBLICATION, new a(4));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) BannerActionEmbeddedEntity.f64088a.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity;", "", "toString", "()Ljava/lang/String;", "Companion", "Link", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class ContentHtml extends BannerActionEmbeddedEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64090c;
        public final String d;
        public final Link e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerActionEmbeddedEntity$ContentHtml$$serializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link;", "", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @g
        public static final /* data */ class Link {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64092b;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$ContentHtml$Link;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return BannerActionEmbeddedEntity$ContentHtml$Link$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Link(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    j1.f(BannerActionEmbeddedEntity$ContentHtml$Link$$serializer.INSTANCE.getDescriptor(), i, 3);
                    throw null;
                }
                this.f64091a = str;
                this.f64092b = str2;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Link)) {
                    return false;
                }
                Link link = (Link) obj2;
                return Intrinsics.f(this.f64091a, link.f64091a) && Intrinsics.f(this.f64092b, link.f64092b);
            }

            public final int hashCode() {
                return this.f64092b.hashCode() + (this.f64091a.hashCode() * 31);
            }
        }

        public /* synthetic */ ContentHtml(int i, String str, String str2, String str3, Link link) {
            if (7 != (i & 7)) {
                j1.f(BannerActionEmbeddedEntity$ContentHtml$$serializer.INSTANCE.getDescriptor(), i, 7);
                throw null;
            }
            this.f64089b = str;
            this.f64090c = str2;
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
            return Intrinsics.f(this.f64089b, contentHtml.f64089b) && Intrinsics.f(this.f64090c, contentHtml.f64090c) && Intrinsics.f(this.d, contentHtml.d) && Intrinsics.f(this.e, contentHtml.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f64089b.hashCode() * 31, 31, this.f64090c), 31, this.d);
            Link link = this.e;
            return iC + (link == null ? 0 : link.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$Uri;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity;", "", "toString", "()Ljava/lang/String;", "Companion", "$serializer", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Uri extends BannerActionEmbeddedEntity {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64094c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$Uri$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/feature/banners/impl/data/database/entity/BannerActionEmbeddedEntity$Uri;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return BannerActionEmbeddedEntity$Uri$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Uri(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(BannerActionEmbeddedEntity$Uri$$serializer.INSTANCE.getDescriptor(), i, 7);
                throw null;
            }
            this.f64093b = str;
            this.f64094c = str2;
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
            return Intrinsics.f(this.f64093b, uri2.f64093b) && Intrinsics.f(this.f64094c, uri2.f64094c) && Intrinsics.f(this.d, uri2.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(this.f64093b.hashCode() * 31, 31, this.f64094c);
        }
    }

    private BannerActionEmbeddedEntity() {
    }
}
