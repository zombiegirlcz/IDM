package dr3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static ht3.c a(st3.c dto, Function1 mapActionToDomain, ht3.b defaultStyle) {
        ht3.b bVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(mapActionToDomain, "mapActionToDomain");
        Intrinsics.checkNotNullParameter(defaultStyle, "defaultStyle");
        String text = dto.getText();
        ht3.a aVar = (ht3.a) mapActionToDomain.invoke(dto.getAction());
        String style = dto.getStyle();
        if (style != null) {
            ht3.b[] bVarArrValues = ht3.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (a0.z(bVar.name(), style, true)) {
                    break;
                }
                i++;
            }
            if (bVar != null) {
                defaultStyle = bVar;
            }
        }
        return new ht3.c(text, aVar, defaultStyle);
    }
}
