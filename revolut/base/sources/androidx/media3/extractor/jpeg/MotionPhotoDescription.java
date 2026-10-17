package androidx.media3.extractor.jpeg;

import androidx.media3.extractor.metadata.MotionPhotoMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j2, long j3) {
            this.mime = str;
            this.semantic = str2;
            this.length = j2;
            this.padding = j3;
        }
    }

    public MotionPhotoDescription(long j2, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j2;
        this.items = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j2) {
        MotionPhotoMetadata motionPhotoMetadata;
        long j3;
        MotionPhotoMetadata motionPhotoMetadata2 = null;
        if (this.items.size() < 2) {
            return null;
        }
        boolean z = true;
        int size = this.items.size() - 1;
        long j5 = j2;
        long j16 = -1;
        long j22 = -1;
        long j42 = -1;
        long j46 = -1;
        while (size >= 0) {
            ContainerItem containerItem = this.items.get(size);
            boolean z3 = (containerItem.mime.equals("video/mp4") || containerItem.mime.equals("video/quicktime")) ? z : false;
            if (size == 0) {
                motionPhotoMetadata = motionPhotoMetadata2;
                j5 -= containerItem.padding;
                j3 = 0;
            } else {
                motionPhotoMetadata = motionPhotoMetadata2;
                j3 = j5 - containerItem.length;
            }
            long j47 = j5;
            j5 = j3;
            if (z3 && j5 != j47) {
                j46 = j47 - j5;
                j42 = j5;
            }
            if (size == 0) {
                j22 = j47;
                j16 = j5;
            }
            size--;
            motionPhotoMetadata2 = motionPhotoMetadata;
            z = true;
        }
        return (j42 == -1 || j46 == -1 || j16 == -1 || j22 == -1) ? motionPhotoMetadata2 : new MotionPhotoMetadata(j16, j22, this.photoPresentationTimestampUs, j42, j46);
    }
}
