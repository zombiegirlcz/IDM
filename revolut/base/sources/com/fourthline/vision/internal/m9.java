package com.fourthline.vision.internal;

import android.util.Size;
import com.fourthline.vision.internal.e3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class m9 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f36565a = new StringBuilder();

    @Override // com.fourthline.vision.internal.h3
    @NotNull
    public e3.c correct(@NotNull e3.c source, @NotNull Size detectionArea) {
        Integer num;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        Iterator<T> it8 = source.getTexts().iterator();
        if (it8.hasNext()) {
            Integer numValueOf = Integer.valueOf(kotlin.text.a0.D(((e3.d) it8.next()).getText(), " ", "", false).length());
            while (it8.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(kotlin.text.a0.D(((e3.d) it8.next()).getText(), " ", "", false).length());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        List<e3.d> texts = source.getTexts();
        ArrayList arrayList = new ArrayList(zhm.w.t(texts, 10));
        for (e3.d dVar : texts) {
            kotlin.text.w.g(this.f36565a);
            this.f36565a.append(dVar.getText());
            StringBuilder sb6 = this.f36565a;
            int i = 0;
            int i2 = 0;
            while (i < sb6.length()) {
                char cCharAt = sb6.charAt(i);
                int i3 = i2 + 1;
                if (cCharAt == ' ') {
                    this.f36565a.replace(i2, i3, "");
                }
                if (cCharAt == 171) {
                    StringBuilder sb9 = this.f36565a;
                    sb9.replace(i2, i3, sb9.length() < iIntValue ? "<<" : "<");
                }
                while (this.f36565a.length() < iIntValue) {
                    this.f36565a.append('<');
                }
                i++;
                i2 = i3;
            }
            String string = this.f36565a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new e3.d(string, dVar.getBox(), dVar.getLines()));
        }
        return new e3.c(arrayList);
    }
}
