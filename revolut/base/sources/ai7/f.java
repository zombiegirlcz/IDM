package ai7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function1;
import qi7.g;

/* JADX INFO: loaded from: classes22.dex */
public final class f {
    public static int a(Object obj2, Object obj3, Function1 function1) {
        float fFloatValue = ((Number) function1.invoke(obj2)).floatValue();
        float fFloatValue2 = ((Number) function1.invoke(obj3)).floatValue();
        if (fFloatValue >= BitmapDescriptorFactory.HUE_RED && fFloatValue2 < BitmapDescriptorFactory.HUE_RED) {
            return -1;
        }
        if (fFloatValue >= BitmapDescriptorFactory.HUE_RED || fFloatValue2 < BitmapDescriptorFactory.HUE_RED) {
            return Float.compare(fFloatValue2, fFloatValue);
        }
        return 1;
    }

    public static float b(g gVar) {
        qi7.c cVar = gVar instanceof qi7.c ? (qi7.c) gVar : null;
        return cVar == null ? BitmapDescriptorFactory.HUE_RED : cVar.f246664c * cVar.f246663b;
    }
}
