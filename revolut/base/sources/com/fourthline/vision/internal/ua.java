package com.fourthline.vision.internal;

import com.fourthline.vision.ScannerMetadata;
import java.net.URI;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScannerMetadata f36984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URI f36985c;

    public ua(@NotNull List<? extends ud> stepResults, @NotNull ScannerMetadata metadata, URI uri2) {
        Intrinsics.checkNotNullParameter(stepResults, "stepResults");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f36983a = stepResults;
        this.f36984b = metadata;
        this.f36985c = uri2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ua copy$default(ua uaVar, List list, ScannerMetadata scannerMetadata, URI uri2, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = uaVar.f36983a;
        }
        if ((i & 2) != 0) {
            scannerMetadata = uaVar.f36984b;
        }
        if ((i & 4) != 0) {
            uri2 = uaVar.f36985c;
        }
        return uaVar.copy(list, scannerMetadata, uri2);
    }

    @NotNull
    public final List<ud> component1() {
        return this.f36983a;
    }

    @NotNull
    public final ScannerMetadata component2() {
        return this.f36984b;
    }

    public final URI component3() {
        return this.f36985c;
    }

    @NotNull
    public final ua copy(@NotNull List<? extends ud> stepResults, @NotNull ScannerMetadata metadata, URI uri2) {
        Intrinsics.checkNotNullParameter(stepResults, "stepResults");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new ua(stepResults, metadata, uri2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj2;
        return Intrinsics.f(this.f36983a, uaVar.f36983a) && Intrinsics.f(this.f36984b, uaVar.f36984b) && Intrinsics.f(this.f36985c, uaVar.f36985c);
    }

    @NotNull
    public final ScannerMetadata getMetadata() {
        return this.f36984b;
    }

    @NotNull
    public final List<ud> getStepResults() {
        return this.f36983a;
    }

    public final URI getVideoUrl() {
        return this.f36985c;
    }

    public int hashCode() {
        int iHashCode = ((this.f36983a.hashCode() * 31) + this.f36984b.hashCode()) * 31;
        URI uri2 = this.f36985c;
        return iHashCode + (uri2 == null ? 0 : uri2.hashCode());
    }

    @NotNull
    public String toString() {
        return "ScannerResult(stepResults=" + this.f36983a + ", metadata=" + this.f36984b + ", videoUrl=" + this.f36985c + ")";
    }
}
