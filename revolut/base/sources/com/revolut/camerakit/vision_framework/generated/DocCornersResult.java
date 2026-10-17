package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class DocCornersResult {
    final DocCorner bottomLeft;
    final DocCorner bottomRight;
    final DocCorner topLeft;
    final DocCorner topRight;

    public DocCornersResult(DocCorner docCorner, DocCorner docCorner2, DocCorner docCorner3, DocCorner docCorner4) {
        this.topLeft = docCorner;
        this.topRight = docCorner2;
        this.bottomRight = docCorner3;
        this.bottomLeft = docCorner4;
    }

    public DocCorner getBottomLeft() {
        return this.bottomLeft;
    }

    public DocCorner getBottomRight() {
        return this.bottomRight;
    }

    public DocCorner getTopLeft() {
        return this.topLeft;
    }

    public DocCorner getTopRight() {
        return this.topRight;
    }

    public String toString() {
        return "DocCornersResult{topLeft=" + this.topLeft + ",topRight=" + this.topRight + ",bottomRight=" + this.bottomRight + ",bottomLeft=" + this.bottomLeft + "}";
    }
}
