package androidx.content.serialization;

import androidx.content.NavType;
import java.util.List;
import java.util.Map;
import jh.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import olm.k;
import org.jetbrains.annotations.NotNull;
import p.a;
import si5.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001ac\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u00032&\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "T", "route", "", "", "Landroidx/navigation/NavType;", "typeMap", "generateRouteWithArgs", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "", "generateHashCode", "(Lkotlinx/serialization/KSerializer;)I", "Lkotlin/Function3;", "", "operation", "forEachIndexedName", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)V", "forEachIndexed", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isValueClass", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RouteSerializerKt {
    private static final <T> void forEachIndexedName(KSerializer kSerializer, Map<String, ? extends NavType<Object>> map, Function3 function3) {
        int iC = kSerializer.getDescriptor().c();
        for (int i = 0; i < iC; i++) {
            String strD = kSerializer.getDescriptor().d(i);
            NavType<Object> navType = map.get(strD);
            if (navType == null) {
                throw new IllegalStateException(a.l(']', "Cannot locate NavType for argument [", strD).toString());
            }
            function3.invoke(Integer.valueOf(i), strD, navType);
        }
    }

    public static final <T> int generateHashCode(@NotNull KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        int iHashCode = kSerializer.getDescriptor().e().hashCode();
        int iC = kSerializer.getDescriptor().c();
        for (int i = 0; i < iC; i++) {
            iHashCode = (iHashCode * 31) + kSerializer.getDescriptor().d(i).hashCode();
        }
        return iHashCode;
    }

    @NotNull
    public static final <T> String generateRouteWithArgs(@NotNull T route, @NotNull Map<String, ? extends NavType<Object>> typeMap) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        KSerializer kSerializerU = d.u(o0.f186429a.b(route.getClass()));
        Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(kSerializerU, typeMap).encodeToArgMap(route);
        RouteBuilder routeBuilder = new RouteBuilder(kSerializerU);
        forEachIndexedName(kSerializerU, typeMap, new c(mapEncodeToArgMap, routeBuilder, 12));
        return routeBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateRouteWithArgs$lambda$5(Map map, RouteBuilder routeBuilder, int i, String argName, NavType navType) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Intrinsics.checkNotNullParameter(navType, "navType");
        Object obj2 = map.get(argName);
        Intrinsics.h(obj2);
        routeBuilder.appendArg(i, argName, navType, (List) obj2);
        return Unit.f186387a;
    }

    public static final boolean isValueClass(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return Intrinsics.f(serialDescriptor.getKind(), k.f226487b) && serialDescriptor.isInline() && serialDescriptor.c() == 1;
    }
}
