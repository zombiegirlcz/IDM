package tkd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ltkd/l;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f271944h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f271946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f271947c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f271948g;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f271949a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f271949a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.impl.model.SlotsData", aVar, 7);
            pluginGeneratedSerialDescriptor.j("prompts", true);
            pluginGeneratedSerialDescriptor.j("todoTiles", true);
            pluginGeneratedSerialDescriptor.j("suggestions", true);
            pluginGeneratedSerialDescriptor.j("airSuggestions", true);
            pluginGeneratedSerialDescriptor.j("promos", true);
            pluginGeneratedSerialDescriptor.j("checklists", true);
            pluginGeneratedSerialDescriptor.j("crossSellTiles", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = l.f271944h;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = l.f271944h;
            dVarBeginStructure.getClass();
            int i = 0;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            List list6 = null;
            List list7 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i |= 1;
                        break;
                    case 1:
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                        i |= 2;
                        break;
                    case 2:
                        list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list3);
                        i |= 4;
                        break;
                    case 3:
                        list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list4);
                        i |= 8;
                        break;
                    case 4:
                        list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list5);
                        i |= 16;
                        break;
                    case 5:
                        list6 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list6);
                        i |= 32;
                        break;
                    case 6:
                        list7 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list7);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l(i, list, list2, list3, list4, list5, list6, list7);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            l value = (l) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = l.f271944h;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f271945a, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f271945a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f271946b, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f271946b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f271947c, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f271947c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.d, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.e, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f271948g, zhm.f0.f322471a)) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f271948g);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: tkd.l$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f271949a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f271944h = new Lazy[]{yhm.j.c(kVar, new th9.k(18)), yhm.j.c(kVar, new th9.k(19)), yhm.j.c(kVar, new th9.k(20)), yhm.j.c(kVar, new th9.k(21)), yhm.j.c(kVar, new th9.k(22)), yhm.j.c(kVar, new th9.k(23)), yhm.j.c(kVar, new th9.k(24))};
    }

    public l(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        this.f271945a = (i & 1) == 0 ? zhm.f0.f322471a : list;
        if ((i & 2) == 0) {
            this.f271946b = zhm.f0.f322471a;
        } else {
            this.f271946b = list2;
        }
        if ((i & 4) == 0) {
            this.f271947c = zhm.f0.f322471a;
        } else {
            this.f271947c = list3;
        }
        if ((i & 8) == 0) {
            this.d = zhm.f0.f322471a;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = zhm.f0.f322471a;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.f271948g = zhm.f0.f322471a;
        } else {
            this.f271948g = list7;
        }
    }

    public static l a(l lVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = lVar.f271945a;
        }
        List prompts = list;
        List list2 = arrayList2;
        if ((i & 2) != 0) {
            list2 = lVar.f271946b;
        }
        List todoTiles = list2;
        List list3 = arrayList3;
        if ((i & 4) != 0) {
            list3 = lVar.f271947c;
        }
        List suggestions = list3;
        List airSuggestions = lVar.d;
        List list4 = arrayList4;
        if ((i & 16) != 0) {
            list4 = lVar.e;
        }
        List promos = list4;
        List list5 = arrayList5;
        if ((i & 32) != 0) {
            list5 = lVar.f;
        }
        List checklists = list5;
        List list6 = arrayList6;
        if ((i & 64) != 0) {
            list6 = lVar.f271948g;
        }
        List crossSellTiles = list6;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(prompts, "prompts");
        Intrinsics.checkNotNullParameter(todoTiles, "todoTiles");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(airSuggestions, "airSuggestions");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(checklists, "checklists");
        Intrinsics.checkNotNullParameter(crossSellTiles, "crossSellTiles");
        return new l(prompts, todoTiles, suggestions, airSuggestions, promos, checklists, crossSellTiles);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f271945a, lVar.f271945a) && Intrinsics.f(this.f271946b, lVar.f271946b) && Intrinsics.f(this.f271947c, lVar.f271947c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f271948g, lVar.f271948g);
    }

    public final int hashCode() {
        return this.f271948g.hashCode() + p.a.d(p.a.d(p.a.d(p.a.d(p.a.d(this.f271945a.hashCode() * 31, 31, this.f271946b), 31, this.f271947c), 31, this.d), 31, this.e), 31, this.f);
    }

    public l(List prompts, List todoTiles, List suggestions, List airSuggestions, List promos, List checklists, List crossSellTiles) {
        Intrinsics.checkNotNullParameter(prompts, "prompts");
        Intrinsics.checkNotNullParameter(todoTiles, "todoTiles");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(airSuggestions, "airSuggestions");
        Intrinsics.checkNotNullParameter(promos, "promos");
        Intrinsics.checkNotNullParameter(checklists, "checklists");
        Intrinsics.checkNotNullParameter(crossSellTiles, "crossSellTiles");
        this.f271945a = prompts;
        this.f271946b = todoTiles;
        this.f271947c = suggestions;
        this.d = airSuggestions;
        this.e = promos;
        this.f = checklists;
        this.f271948g = crossSellTiles;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(f0Var, f0Var, f0Var, f0Var, f0Var, f0Var, f0Var);
    }
}
