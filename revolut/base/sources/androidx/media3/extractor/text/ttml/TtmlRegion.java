package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes15.dex */
final class TtmlRegion {
    public final float height;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f7638id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final int verticalType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE);
    }

    public TtmlRegion(String str, float f, float f4, int i, int i2, float f5, float f6, int i3, float f32, int i5) {
        this.f7638id = str;
        this.position = f;
        this.line = f4;
        this.lineType = i;
        this.lineAnchor = i2;
        this.width = f5;
        this.height = f6;
        this.textSizeType = i3;
        this.textSize = f32;
        this.verticalType = i5;
    }
}
