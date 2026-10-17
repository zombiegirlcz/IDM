package com.fourthline.orca.internal;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import com.fourthline.orca.internal.r10;
import com.fourthline.orca.internal.z10;
import java.io.File;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class a20 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[r10.b.values().length];
            try {
                iArr[r10.b.f32604a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r10.b.f32605b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r10.b.f32606c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Painter a(z10 imageSource, Composer composer, int i) {
        Painter painterPainterResource;
        boolean z;
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1476928365, i, -1, "com.fourthline.orca.core.internal.composable.image.imageSourcePainter (ImageSourcePainter.kt:26)");
        }
        if (a(imageSource, (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
            composer.startReplaceGroup(1528085271);
            if (imageSource instanceof z10.b) {
                composer.startReplaceGroup(1988957357);
                painterPainterResource = PainterResources_androidKt.painterResource(((z10.b) imageSource).b(), composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(imageSource instanceof z10.a)) {
                    composer.startReplaceGroup(1988955723);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1528224306);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                z10.a aVar = (z10.a) imageSource;
                int i2 = a.$EnumSwitchMapping$0[aVar.c().ordinal()];
                if (i2 == 1) {
                    composer.startReplaceGroup(1528335596);
                    z = (((i & 14) ^ 6) > 4 && composer.changed(imageSource)) || (i & 6) == 4;
                    Object objRememberedValue = composer.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new pj0(aVar.b(), density);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    painterPainterResource = (pj0) objRememberedValue;
                    composer.endReplaceGroup();
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            composer.startReplaceGroup(1988962364);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(1988970251);
                        composer.endReplaceGroup();
                        throw new IllegalStateException("FL Developer error. PNG painter is not supported yet!");
                    }
                    composer.startReplaceGroup(1528435788);
                    z = (((i & 14) ^ 6) > 4 && composer.changed(imageSource)) || (i & 6) == 4;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new q71(aVar.b(), density);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    painterPainterResource = (q71) objRememberedValue2;
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1528655702);
            composer.endReplaceGroup();
            z10.a aVar2 = imageSource instanceof z10.a ? (z10.a) imageSource : null;
            r10.b bVarC = aVar2 != null ? aVar2.c() : null;
            Objects.toString(imageSource);
            Objects.toString(bVarC);
            painterPainterResource = fw.f28672a;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painterPainterResource;
    }

    private static final boolean a(z10 z10Var, Context context) {
        if (z10Var instanceof z10.b) {
            return vc.a(context, ((z10.b) z10Var).b());
        }
        if (z10Var instanceof z10.a) {
            return a(((z10.a) z10Var).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean a(File file) {
        return (file.exists() && file.length() == 0) ? false : true;
    }
}
