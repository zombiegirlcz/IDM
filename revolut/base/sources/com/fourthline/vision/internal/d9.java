package com.fourthline.vision.internal;

import android.graphics.Rect;
import com.fourthline.vision.internal.e3;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class d9 implements f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f36105a;

    /* JADX WARN: Multi-variable type inference failed */
    public d9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(com.google.mlkit.vision.text.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return true;
    }

    @Override // com.fourthline.vision.internal.f3
    @NotNull
    public e3.c buildDetectionRoot(@NotNull Text sourceDetection) {
        List<Text.Line> list;
        Intrinsics.checkNotNullParameter(sourceDetection, "sourceDetection");
        List listUnmodifiableList = Collections.unmodifiableList(sourceDetection.f49674a);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "getTextBlocks(...)");
        Function1 function1 = this.f36105a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listUnmodifiableList) {
            if (((Boolean) function1.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            com.google.mlkit.vision.text.a aVar = (com.google.mlkit.vision.text.a) obj3;
            String strJ = aVar.j();
            Intrinsics.checkNotNullExpressionValue(strJ, "getText(...)");
            fa faVarNullableToRectangle = ga.nullableToRectangle((Rect) aVar.f151344b);
            synchronized (aVar) {
                list = aVar.d;
            }
            Intrinsics.checkNotNullExpressionValue(list, "getLines(...)");
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
            for (Text.Line line : list) {
                String strJ2 = line.j();
                Intrinsics.checkNotNullExpressionValue(strJ2, "getText(...)");
                arrayList3.add(new e3.a(strJ2, ga.nullableToRectangle((Rect) line.f151344b), null, 4, null));
            }
            arrayList2.add(new e3.d(strJ, faVarNullableToRectangle, arrayList3));
        }
        return new e3.c(arrayList2);
    }

    public d9(@NotNull Function1<? super com.google.mlkit.vision.text.a, Boolean> isBlockOk) {
        Intrinsics.checkNotNullParameter(isBlockOk, "isBlockOk");
        this.f36105a = isBlockOk;
    }

    public /* synthetic */ d9(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new aem.d(14) : function1);
    }
}
