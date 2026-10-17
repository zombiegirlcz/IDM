package com.revolut.feature.selfserve.sow.impl.dto;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/dto/UploadDocumentsResponseDto;", "", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UploadDocumentsResponseDto {

    @b("ids")
    @NotNull
    private final List<String> ids;

    public UploadDocumentsResponseDto(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.ids = ids;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadDocumentsResponseDto copy$default(UploadDocumentsResponseDto uploadDocumentsResponseDto, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = uploadDocumentsResponseDto.ids;
        }
        return uploadDocumentsResponseDto.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.ids;
    }

    @NotNull
    public final UploadDocumentsResponseDto copy(@NotNull List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new UploadDocumentsResponseDto(ids);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UploadDocumentsResponseDto) && Intrinsics.f(this.ids, ((UploadDocumentsResponseDto) other).ids);
    }

    @NotNull
    public final List<String> getIds() {
        return this.ids;
    }

    public int hashCode() {
        return this.ids.hashCode();
    }
}
