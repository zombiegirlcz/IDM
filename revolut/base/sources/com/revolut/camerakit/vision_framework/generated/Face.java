package com.revolut.camerakit.vision_framework.generated;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class Face {
    final Bbox boundingBox;
    final float confidence;
    final ArrayList<Point2f> kps;

    public Face(Bbox bbox, float f, ArrayList<Point2f> arrayList) {
        this.boundingBox = bbox;
        this.confidence = f;
        this.kps = arrayList;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Face)) {
            return false;
        }
        Face face = (Face) obj2;
        return this.boundingBox.equals(face.boundingBox) && this.confidence == face.confidence && this.kps.equals(face.kps);
    }

    public Bbox getBoundingBox() {
        return this.boundingBox;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public ArrayList<Point2f> getKps() {
        return this.kps;
    }

    public int hashCode() {
        return this.kps.hashCode() + ((Float.floatToIntBits(this.confidence) + ((this.boundingBox.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        return "Face{boundingBox=" + this.boundingBox + ",confidence=" + this.confidence + ",kps=" + this.kps + "}";
    }
}
