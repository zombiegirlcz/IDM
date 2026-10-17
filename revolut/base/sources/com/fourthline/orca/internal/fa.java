package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes23.dex */
public final class fa implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28387b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f28388c = 8;
    private static aj0 d = aj0.d;
    private static Map e = zhm.r0.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f28389a = com.bumptech.glide.c.d("ColorElement", new SerialDescriptor[0], new bi1(24));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(aj0 aj0Var) {
            Intrinsics.checkNotNullParameter(aj0Var, "<set-?>");
            fa.d = aj0Var;
        }

        private a() {
        }

        public final void a(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            fa.e = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ea b(fa faVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return faVar.a(key);
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f28389a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ea a(fa faVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return faVar.a(key);
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ea deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder instanceof rlm.i) {
            JsonElement jsonElementC = ((rlm.i) decoder).c();
            if (jsonElementC instanceof kotlinx.serialization.json.b) {
                return a(((kotlinx.serialization.json.b) jsonElementC).a());
            }
            if (jsonElementC instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElementC;
                if (jsonObject.containsKey("color")) {
                    JsonElement jsonElementA = s40.a(jsonObject, "color");
                    if (jsonElementA instanceof kotlinx.serialization.json.b) {
                        return a(((kotlinx.serialization.json.b) jsonElementA).a());
                    }
                    if (jsonElementA instanceof JsonObject) {
                        JsonObject jsonObject2 = (JsonObject) jsonElementA;
                        final int i = 0;
                        return f81.a(rlm.j.l(s40.a(jsonObject2, "light")).a(), rlm.j.l(s40.a(jsonObject2, "dark")).a(), d, new Function1(this) { // from class: com.fourthline.orca.internal.wl1

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ fa f34739b;

                            {
                                this.f34739b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i) {
                                    case 0:
                                        return fa.a(this.f34739b, (String) obj2);
                                    default:
                                        return fa.b(this.f34739b, (String) obj2);
                                }
                            }
                        });
                    }
                    throw new IllegalStateException("FL Developer Error. Invalid 'color' value in ColorElement.");
                }
                if (jsonObject.containsKey("light") && jsonObject.containsKey("dark")) {
                    final int i2 = 1;
                    return f81.a(rlm.j.l(s40.a(jsonObject, "light")).a(), rlm.j.l(s40.a(jsonObject, "dark")).a(), d, new Function1(this) { // from class: com.fourthline.orca.internal.wl1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ fa f34739b;

                        {
                            this.f34739b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    return fa.a(this.f34739b, (String) obj2);
                                default:
                                    return fa.b(this.f34739b, (String) obj2);
                            }
                        }
                    });
                }
                throw new IllegalStateException("FL Developer Error. ColorElement object must have 'light' and 'dark', or 'color'.");
            }
            throw new IllegalStateException("FL Developer Error. Failed to deserialize color.");
        }
        throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of ColorElement.");
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, ea value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }

    private final ea a(String str) {
        if (kotlin.text.a0.H(str, "#", false)) {
            long jA = fi0.a(str);
            return new ea(jA, jA, null);
        }
        di0 di0Var = (di0) e.get(str);
        if (di0Var != null) {
            return new ea(di0Var.getLight(), di0Var.getDark(), null);
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize color ('" + str + "').").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(olm.a buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        zhm.f0 f0Var = zhm.f0.f322471a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        qlm.n1 n1Var = qlm.v1.f247719b;
        buildClassSerialDescriptor.a("light", n1Var, f0Var, false);
        buildClassSerialDescriptor.a("dark", n1Var, f0Var, false);
        return Unit.f186387a;
    }
}
