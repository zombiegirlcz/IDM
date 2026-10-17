package com.fourthline.vision.internal;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class qe implements ib.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f36734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fa f36735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f36736c;
    private final int d;
    private final String e;
    private final String f;

    public qe(@NotNull Throwable error, @NotNull fa translatedRectangle, int i, int i2) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(translatedRectangle, "translatedRectangle");
        this.f36734a = error;
        this.f36735b = translatedRectangle;
        this.f36736c = i;
        this.d = i2;
        this.e = "document_scan_step_failed";
        this.f = "iglu:com.fourthline.sdk/document_scan_step_failed/jsonschema/1-0-0";
    }

    private final Throwable component1() {
        return this.f36734a;
    }

    private final fa component2() {
        return this.f36735b;
    }

    private final int component3() {
        return this.f36736c;
    }

    private final int component4() {
        return this.d;
    }

    public static /* synthetic */ qe copy$default(qe qeVar, Throwable th10, fa faVar, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            th10 = qeVar.f36734a;
        }
        if ((i3 & 2) != 0) {
            faVar = qeVar.f36735b;
        }
        if ((i3 & 4) != 0) {
            i = qeVar.f36736c;
        }
        if ((i3 & 8) != 0) {
            i2 = qeVar.d;
        }
        return qeVar.copy(th10, faVar, i, i2);
    }

    @NotNull
    public final qe copy(@NotNull Throwable error, @NotNull fa translatedRectangle, int i, int i2) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(translatedRectangle, "translatedRectangle");
        return new qe(error, translatedRectangle, i, i2);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj2;
        return Intrinsics.f(this.f36734a, qeVar.f36734a) && Intrinsics.f(this.f36735b, qeVar.f36735b) && this.f36736c == qeVar.f36736c && this.d == qeVar.d;
    }

    @Override // ib.f
    @NotNull
    public Map<String, Object> getAttributes() {
        return zhm.r0.k(new Pair("error", this.f36734a), new Pair("bitmap_width", Integer.valueOf(this.f36736c)), new Pair("bitmap_height", Integer.valueOf(this.d)), new Pair("rectangle_left", Integer.valueOf(this.f36735b.getLeft())), new Pair("rectangle_top", Integer.valueOf(this.f36735b.getTop())), new Pair("rectangle_right", Integer.valueOf(this.f36735b.getRight())), new Pair("rectangle_bottom", Integer.valueOf(this.f36735b.getBottom())), new Pair("rectangle_width", Integer.valueOf(this.f36735b.width())), new Pair("rectangle_height", Integer.valueOf(this.f36735b.height())));
    }

    @Override // ib.f
    @NotNull
    public String getEventName() {
        return this.e;
    }

    @Override // ib.f
    @NotNull
    public String getSchema() {
        return this.f;
    }

    public int hashCode() {
        return (((((this.f36734a.hashCode() * 31) + this.f36735b.hashCode()) * 31) + Integer.hashCode(this.f36736c)) * 31) + Integer.hashCode(this.d);
    }

    @NotNull
    public String toString() {
        return "BitmapCroppingFailed(error=" + this.f36734a + ", translatedRectangle=" + this.f36735b + ", bitmapWidth=" + this.f36736c + ", bitmapHeight=" + this.d + ")";
    }
}
