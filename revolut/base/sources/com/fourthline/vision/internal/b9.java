package com.fourthline.vision.internal;

import android.util.Size;
import com.fourthline.vision.internal.e3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b9 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36007a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.fourthline.vision.internal.h3
    @NotNull
    public e3.c correct(@NotNull e3.c source, @NotNull Size detectionArea) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        List<e3.d> texts = source.getTexts();
        ArrayList arrayList = new ArrayList(zhm.w.t(texts, 10));
        for (e3.d text : texts) {
            List<e3.a> lines = text.getLines();
            if (lines != null && !lines.isEmpty()) {
                Iterator<T> it8 = text.getLines().iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iHeight = ((e3.a) it8.next()).getBox().height();
                while (it8.hasNext()) {
                    int iHeight2 = ((e3.a) it8.next()).getBox().height();
                    if (iHeight < iHeight2) {
                        iHeight = iHeight2;
                    }
                }
                List<e3.a> lines2 = text.getLines();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : lines2) {
                    e3.a aVar = (e3.a) obj2;
                    boolean z = ((float) aVar.getBox().height()) / ((float) iHeight) > 0.5f;
                    if (!z) {
                        if (b9.class.isAnonymousClass()) {
                            String name = b9.class.getName();
                            if (name.length() > 23) {
                                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                            }
                        }
                        aVar.getText();
                    }
                    if (z) {
                        arrayList2.add(obj2);
                    }
                }
                text = i3.toText(arrayList2);
            }
            arrayList.add(text);
        }
        ArrayList arrayListF0 = zhm.d0.F0(i3.merged(arrayList), arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayListF0) {
            e3.d dVar = (e3.d) obj3;
            boolean z3 = ((float) dVar.getBox().width()) / ((float) detectionArea.getWidth()) > 0.4f;
            if (!z3) {
                if (b9.class.isAnonymousClass()) {
                    String name2 = b9.class.getName();
                    if (name2.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
                    }
                }
                dVar.getText();
            }
            if (z3) {
                arrayList3.add(obj3);
            }
        }
        return new e3.c(arrayList3);
    }
}
