package jr;

import ip0.v7;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes17.dex */
public final class e1 extends qlm.p0 {
    public static final e1 d = new e1();

    private e1() {
        super(kotlin.jvm.internal.o0.f186429a.b(d1.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // qlm.p0
    public final mlm.b c(JsonElement jsonElement) {
        JsonElement jsonElement2 = (JsonElement) v7.s(jsonElement, "element", jsonElement, "type");
        String strA = jsonElement2 != null ? rlm.j.l(jsonElement2).a() : null;
        if (strA != null) {
            switch (strA.hashCode()) {
                case -1520658362:
                    if (strA.equals("DOCUMENT_SEGMENTATION")) {
                        return w0.INSTANCE.serializer();
                    }
                    break;
                case -1472552920:
                    if (strA.equals("DOCUMENT_QUALITY_REV_VISION")) {
                        return s0.INSTANCE.serializer();
                    }
                    break;
                case -193652999:
                    if (strA.equals("DOCUMENT_CLASSIFICATION_REV_VISION")) {
                        return p0.INSTANCE.serializer();
                    }
                    break;
                case 537168649:
                    if (strA.equals("DOCUMENT_CORNERS_REV_VISION")) {
                        return q0.INSTANCE.serializer();
                    }
                    break;
                case 845354545:
                    if (strA.equals("DOCUMENT_MRZ")) {
                        return r0.INSTANCE.serializer();
                    }
                    break;
                case 1492694950:
                    if (strA.equals("FACE_QUALITY_REV_VISION")) {
                        return y0.INSTANCE.serializer();
                    }
                    break;
                case 1984948315:
                    if (strA.equals("FACE_DETECTOR_REV_VISION")) {
                        return x0.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return c1.INSTANCE.serializer();
    }
}
