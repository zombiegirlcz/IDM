package com.fourthline.orca.internal;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/mz;", "", "Landroidx/compose/ui/text/font/FontFamily;", "family", "Landroidx/compose/ui/unit/TextUnit;", "size", "lineHeight", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "maxSize", "Lkotlin/Pair;", "a", "(Landroidx/compose/ui/unit/TextUnit;Landroidx/compose/runtime/Composer;II)Lkotlin/Pair;", "(Landroidx/compose/ui/text/font/FontFamily;JJ)Lcom/fourthline/orca/internal/mz;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/font/FontFamily;", "b", "()Landroidx/compose/ui/text/font/FontFamily;", "J", "getSize-XSAIIZE", "()J", "c", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = nz.class)
public final /* data */ class mz {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final mz d = new mz(FontFamily.INSTANCE.getDefault(), TextUnitKt.getSp(12), 0, 4, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FontFamily family;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lineHeight;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.mz$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mz a() {
            return mz.d;
        }

        @NotNull
        public final KSerializer serializer() {
            return new nz();
        }

        private Companion() {
        }
    }

    public /* synthetic */ mz(FontFamily fontFamily, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, j2, j3);
    }

    public final mz a(FontFamily family, long size, long lineHeight) {
        Intrinsics.checkNotNullParameter(family, "family");
        return new mz(family, size, lineHeight, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FontFamily getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) other;
        return Intrinsics.f(this.family, mzVar.family) && TextUnit.m3367equalsimpl0(this.size, mzVar.size) && TextUnit.m3367equalsimpl0(this.lineHeight, mzVar.lineHeight);
    }

    public int hashCode() {
        return (((this.family.hashCode() * 31) + TextUnit.m3371hashCodeimpl(this.size)) * 31) + TextUnit.m3371hashCodeimpl(this.lineHeight);
    }

    public String toString() {
        return "FontElement(family=" + this.family + ", size=" + TextUnit.m3373toStringimpl(this.size) + ", lineHeight=" + TextUnit.m3373toStringimpl(this.lineHeight) + ")";
    }

    private mz(FontFamily family, long j2, long j3) {
        Intrinsics.checkNotNullParameter(family, "family");
        this.family = family;
        this.size = j2;
        this.lineHeight = j3;
    }

    public static /* synthetic */ mz a(mz mzVar, FontFamily fontFamily, long j2, long j3, int i, Object obj2) {
        if ((i & 1) != 0) {
            fontFamily = mzVar.family;
        }
        if ((i & 2) != 0) {
            j2 = mzVar.size;
        }
        if ((i & 4) != 0) {
            j3 = mzVar.lineHeight;
        }
        return mzVar.a(fontFamily, j2, j3);
    }

    public final Pair a(TextUnit textUnit, Composer composer, int i, int i2) {
        long jPack;
        long jPack2;
        if ((i2 & 1) != 0) {
            textUnit = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236946033, i, -1, "com.fourthline.orca.core.internal.styling.common.FontElement.getTextSizeToLineHeight (StylingElement.kt:48)");
        }
        if (textUnit != null) {
            composer.startReplaceGroup(960342402);
            float f = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).fontScale;
            long j2 = this.size;
            TextUnitKt.m3377checkArithmeticR2X_6o(j2);
            jPack = TextUnitKt.pack(TextUnit.m3368getRawTypeimpl(j2), TextUnit.m3370getValueimpl(j2) * f);
            long packedValue = textUnit.getPackedValue();
            TextUnitKt.m3378checkArithmeticNB67dxo(jPack, packedValue);
            if (Float.compare(TextUnit.m3370getValueimpl(jPack), TextUnit.m3370getValueimpl(packedValue)) > 0) {
                float fM3370getValueimpl = TextUnit.m3370getValueimpl(textUnit.getPackedValue()) / TextUnit.m3370getValueimpl(this.size);
                jPack = textUnit.getPackedValue();
                long j3 = this.lineHeight;
                TextUnitKt.m3377checkArithmeticR2X_6o(j3);
                jPack2 = TextUnitKt.pack(TextUnit.m3368getRawTypeimpl(j3), TextUnit.m3370getValueimpl(j3) * fM3370getValueimpl);
            } else {
                long j5 = this.lineHeight;
                TextUnitKt.m3377checkArithmeticR2X_6o(j5);
                jPack2 = TextUnitKt.pack(TextUnit.m3368getRawTypeimpl(j5), TextUnit.m3370getValueimpl(j5) * f);
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(960859668);
            composer.endReplaceGroup();
            jPack = this.size;
            jPack2 = this.lineHeight;
        }
        Pair pair = new Pair(TextUnit.m3364boximpl(jPack), TextUnit.m3364boximpl(jPack2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pair;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ mz(FontFamily fontFamily, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            TextUnitKt.m3377checkArithmeticR2X_6o(j2);
            j3 = TextUnitKt.pack(TextUnit.m3368getRawTypeimpl(j2), (float) (((double) TextUnit.m3370getValueimpl(j2)) * 1.5d));
        }
        this(fontFamily, j2, j3, null);
    }
}
