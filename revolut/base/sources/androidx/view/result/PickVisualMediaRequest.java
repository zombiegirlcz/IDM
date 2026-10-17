package androidx.view.result;

import androidx.view.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.view.result.contract.ActivityResultContracts$PickVisualMedia;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00010B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00138\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00138\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R*\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0005\u001a\u0004\u0018\u00010)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "value", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "", "maxItems", "I", "getMaxItems", "()I", "setMaxItems$activity", "(I)V", "", "isOrderedSelection", "Z", "()Z", "setOrderedSelection$activity", "(Z)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "getDefaultTab", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "setDefaultTab$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)V", "isCustomAccentColorApplied", "setCustomAccentColorApplied$activity", "", "accentColor", "J", "getAccentColor", "()J", "setAccentColor$activity", "(J)V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "mediaCapabilitiesForTranscoding", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "getMediaCapabilitiesForTranscoding", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;", "setMediaCapabilitiesForTranscoding$activity", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$MediaCapabilities;)V", "Builder", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PickVisualMediaRequest {
    private long accentColor;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;

    @NotNull
    private ActivityResultContracts$PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts$PickVisualMedia.ImageAndVideo.INSTANCE;
    private int maxItems = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();

    @NotNull
    private ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts$PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "<init>", "()V", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "setMediaType", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "maxItems", "setMaxItems", "(I)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "isOrderedSelection", "setOrderedSelection", "(Z)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "defaultTab", "setDefaultTab", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;)Landroidx/activity/result/PickVisualMediaRequest$Builder;", "Landroidx/activity/result/PickVisualMediaRequest;", "build", "()Landroidx/activity/result/PickVisualMediaRequest;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "I", "Z", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "isCustomAccentColorApplied", "", "accentColor", "J", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private long accentColor;
        private boolean isCustomAccentColorApplied;
        private boolean isOrderedSelection;

        @NotNull
        private ActivityResultContracts$PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts$PickVisualMedia.ImageAndVideo.INSTANCE;
        private int maxItems = ActivityResultContracts$PickMultipleVisualMedia.INSTANCE.getMaxItems$activity();

        @NotNull
        private ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts$PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

        @NotNull
        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity(this.mediaType);
            pickVisualMediaRequest.setMaxItems$activity(this.maxItems);
            pickVisualMediaRequest.setOrderedSelection$activity(this.isOrderedSelection);
            pickVisualMediaRequest.setDefaultTab$activity(this.defaultTab);
            pickVisualMediaRequest.setCustomAccentColorApplied$activity(this.isCustomAccentColorApplied);
            pickVisualMediaRequest.setAccentColor$activity(this.accentColor);
            pickVisualMediaRequest.setMediaCapabilitiesForTranscoding$activity(null);
            return pickVisualMediaRequest;
        }

        @NotNull
        public final Builder setDefaultTab(@NotNull ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab) {
            Intrinsics.checkNotNullParameter(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        @NotNull
        public final Builder setMaxItems(int maxItems) {
            this.maxItems = maxItems;
            return this;
        }

        @NotNull
        public final Builder setMediaType(@NotNull ActivityResultContracts$PickVisualMedia.VisualMediaType mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        @NotNull
        public final Builder setOrderedSelection(boolean isOrderedSelection) {
            this.isOrderedSelection = isOrderedSelection;
            return this;
        }
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    @NotNull
    public final ActivityResultContracts$PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final ActivityResultContracts$PickVisualMedia.MediaCapabilities getMediaCapabilitiesForTranscoding() {
        return null;
    }

    @NotNull
    public final ActivityResultContracts$PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: isCustomAccentColorApplied, reason: from getter */
    public final boolean getIsCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final void setAccentColor$activity(long j2) {
        this.accentColor = j2;
    }

    public final void setCustomAccentColorApplied$activity(boolean z) {
        this.isCustomAccentColorApplied = z;
    }

    public final void setDefaultTab$activity(@NotNull ActivityResultContracts$PickVisualMedia.DefaultTab defaultTab) {
        Intrinsics.checkNotNullParameter(defaultTab, "<set-?>");
        this.defaultTab = defaultTab;
    }

    public final void setMaxItems$activity(int i) {
        this.maxItems = i;
    }

    public final void setMediaCapabilitiesForTranscoding$activity(ActivityResultContracts$PickVisualMedia.MediaCapabilities mediaCapabilities) {
    }

    public final void setMediaType$activity(@NotNull ActivityResultContracts$PickVisualMedia.VisualMediaType visualMediaType) {
        Intrinsics.checkNotNullParameter(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }

    public final void setOrderedSelection$activity(boolean z) {
        this.isOrderedSelection = z;
    }
}
