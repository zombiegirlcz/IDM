package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;
import vv7.l;
import vz1.h;
import w2.b;
import w2.c;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0011\"&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\".\u0010\u0019\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00180\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\".\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0018\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u0012\u0004\b\u001b\u0010\u001c\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014\"&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b \u0010\u0014\u0012\u0004\b!\u0010\u001c\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0014\" \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014\"&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016\"&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\u0014\u001a\u0004\b+\u0010\u0016\"&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0016\" \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014\" \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014\" \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014\" \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014\" \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014\" \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014\" \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014\" \u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\" \u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?\" \u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?\"&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010\u0016\"&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010\u0014\u001a\u0004\bK\u0010\u0016\" \u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010?\"&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010Q\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010?\" \u0010U\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014\" \u0010W\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0014\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0014\" \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010?\" \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010?\" \u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010?\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u0000*\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b0\u0000*\u00020d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010e\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u0000*\u00020f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010g\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u0000*\u00020h8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010i\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020j8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010k\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u0000*\u00020l8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010m\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010o\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\b0\u0000*\u00020p8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010q\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0\u0000*\u00020r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010s\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u0000*\u00020t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010u\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\b0\u0000*\u00020v8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010w\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\b0\u0000*\u00020x8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010y\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\b0\u0000*\u00020z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010{\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0\u0000*\u00020|8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010}\"$\u0010c\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0\u0000*\u00020~8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u007f\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0080\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u0081\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0082\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u0083\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0084\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u0085\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0086\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u0087\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0088\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u0089\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u008a\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u008b\u0001\"&\u0010c\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u008c\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\ba\u0010\u008d\u0001¨\u0006\u008e\u0001"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "T", "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "save", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/Function1;", "restore", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "NonNullValueClassSaver", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/NonNullValueClassSaver;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeListSaver", "AnnotationRangeSaver", "getAnnotationRangeSaver$annotations", "()V", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "UrlAnnotationSaver", "getUrlAnnotationSaver$annotations", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "LinkSaver", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "ClickableSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "ParagraphStyleSaver", "getParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "SpanStyleSaver", "getSpanStyleSaver", "Landroidx/compose/ui/text/TextLinkStyles;", "TextLinkStylesSaver", "getTextLinkStylesSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextIndentSaver", "Landroidx/compose/ui/text/font/FontWeight;", "FontWeightSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "BaselineShiftSaver", "Landroidx/compose/ui/text/TextRange;", "TextRangeSaver", "Landroidx/compose/ui/graphics/Shadow;", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "ColorSaver", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "Landroidx/compose/ui/text/style/TextAlign;", "TextAlignSaver", "Landroidx/compose/ui/text/style/TextDirection;", "TextDirectionSaver", "Landroidx/compose/ui/text/style/Hyphens;", "HyphensSaver", "Landroidx/compose/ui/text/font/FontStyle;", "FontStyleSaver", "getFontStyleSaver", "Landroidx/compose/ui/text/font/FontSynthesis;", "FontSynthesisSaver", "getFontSynthesisSaver", "Landroidx/compose/ui/unit/TextUnit;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnitTypeSaver", "getTextUnitTypeSaver", "()Landroidx/compose/ui/text/NonNullValueClassSaver;", "Landroidx/compose/ui/geometry/Offset;", "OffsetSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/Locale;", "LocaleSaver", "Landroidx/compose/ui/text/style/LineHeightStyle;", "LineHeightStyleSaver", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "LineHeightStyleAlignmentSaver", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "LineHeightStyleTrimSaver", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "LineHeightStyleModeSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextAlign$Companion;", "(Landroidx/compose/ui/text/style/TextAlign$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDirection$Companion;", "(Landroidx/compose/ui/text/style/TextDirection$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/Hyphens$Companion;", "(Landroidx/compose/ui/text/style/Hyphens$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontStyle$Companion;", "(Landroidx/compose/ui/text/font/FontStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "(Landroidx/compose/ui/text/font/FontSynthesis$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnitType$Companion;", "(Landroidx/compose/ui/unit/TextUnitType$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "(Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class SaversKt {

    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver;

    @NotNull
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver;

    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new l(25), new h(18));

    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new b(2), new c(0));

    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new b(14), new c(12));

    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new b(21), new c(14));

    @NotNull
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new b(23), new c(15));

    @NotNull
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new b(0), new h(27));

    @NotNull
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new b(11), new c(8));

    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new b(22), new c(16));

    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new l(26), new h(19));

    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new l(27), new h(20));

    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new l(28), new h(21));

    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new l(29), new h(22));

    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new b(1), new h(23));

    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new b(3), new h(24));

    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new b(4), new h(25));

    @NotNull
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new Function2<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            return m2911invoke4WTKRHQ((SaverScope) obj2, ((Color) obj3).getValue());
        }

        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m2911invoke4WTKRHQ(SaverScope saverScope, long j2) {
            return j2 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m2002toArgb8_81llA(j2));
        }
    }, new Function1<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj2) {
            if (Intrinsics.f(obj2, Boolean.FALSE)) {
                return Color.m1972boximpl(Color.INSTANCE.m1994getUnspecified0d7_KjU());
            }
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
            return Color.m1972boximpl(ColorKt.Color(((Integer) obj2).intValue()));
        }
    });

    @NotNull
    private static final NonNullValueClassSaver<TextAlign, Object> TextAlignSaver = NonNullValueClassSaver(new b(5), new h(26));

    @NotNull
    private static final NonNullValueClassSaver<TextDirection, Object> TextDirectionSaver = NonNullValueClassSaver(new b(6), new h(28));

    @NotNull
    private static final NonNullValueClassSaver<Hyphens, Object> HyphensSaver = NonNullValueClassSaver(new b(7), new h(29));

    @NotNull
    private static final Saver<FontStyle, Object> FontStyleSaver = SaverKt.Saver(new b(8), new c(1));

    @NotNull
    private static final Saver<FontSynthesis, Object> FontSynthesisSaver = SaverKt.Saver(new b(9), new c(2));

    @NotNull
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new b(10), new c(3));

    @NotNull
    private static final NonNullValueClassSaver<TextUnitType, Object> TextUnitTypeSaver = NonNullValueClassSaver(new b(12), new c(4));

    @NotNull
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new b(13), new c(5));

    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new b(15), new c(6));

    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new b(16), new c(7));

    @NotNull
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new b(17), new c(9));

    @NotNull
    private static final NonNullValueClassSaver<LineHeightStyle.Alignment, Object> LineHeightStyleAlignmentSaver = NonNullValueClassSaver(new b(18), new c(10));

    @NotNull
    private static final NonNullValueClassSaver<LineHeightStyle.Trim, Object> LineHeightStyleTrimSaver = NonNullValueClassSaver(new b(19), new c(11));

    @NotNull
    private static final NonNullValueClassSaver<LineHeightStyle.Mode, Object> LineHeightStyleModeSaver = NonNullValueClassSaver(new b(20), new c(13));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationType.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = 17;
        SpanStyleSaver = SaverKt.Saver(new b(24), new c(i));
        TextLinkStylesSaver = SaverKt.Saver(new b(25), new h(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotatedStringSaver$lambda$0(SaverScope saverScope, AnnotatedString annotatedString) {
        return v.e(save(annotatedString.getText()), save(annotatedString.getAnnotations$ui_text(), AnnotationRangeListSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString AnnotatedStringSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(1);
        Saver<List<AnnotatedString.Range<? extends Object>>, Object> saver = AnnotationRangeListSaver;
        List<AnnotatedString.Range<? extends Object>> listRestore = ((!Intrinsics.f(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Object obj4 = list.get(0);
        String str = obj4 != null ? (String) obj4 : null;
        Intrinsics.h(str);
        return new AnnotatedString(listRestore, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeListSaver$lambda$0(SaverScope saverScope, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save((AnnotatedString.Range) list.get(i), AnnotationRangeSaver, saverScope));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List AnnotationRangeListSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            Saver<AnnotatedString.Range<? extends Object>, Object> saver = AnnotationRangeSaver;
            AnnotatedString.Range<? extends Object> rangeRestore = null;
            if ((!Intrinsics.f(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                rangeRestore = saver.restore(obj3);
            }
            Intrinsics.h(rangeRestore);
            arrayList.add(rangeRestore);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AnnotationRangeSaver$lambda$0(SaverScope saverScope, AnnotatedString.Range range) {
        AnnotationType annotationType;
        Object objSave;
        Object item = range.getItem();
        if (item instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (item instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (item instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (item instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (item instanceof LinkAnnotation.Url) {
            annotationType = AnnotationType.Link;
        } else if (item instanceof LinkAnnotation.Clickable) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(item instanceof StringAnnotation)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.String;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object item2 = range.getItem();
                Intrinsics.i(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objSave = save((ParagraphStyle) item2, ParagraphStyleSaver, saverScope);
                break;
            case 2:
                Object item3 = range.getItem();
                Intrinsics.i(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objSave = save((SpanStyle) item3, SpanStyleSaver, saverScope);
                break;
            case 3:
                Object item4 = range.getItem();
                Intrinsics.i(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objSave = save((VerbatimTtsAnnotation) item4, VerbatimTtsAnnotationSaver, saverScope);
                break;
            case 4:
                Object item5 = range.getItem();
                Intrinsics.i(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objSave = save((UrlAnnotation) item5, UrlAnnotationSaver, saverScope);
                break;
            case 5:
                Object item6 = range.getItem();
                Intrinsics.i(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objSave = save((LinkAnnotation.Url) item6, LinkSaver, saverScope);
                break;
            case 6:
                Object item7 = range.getItem();
                Intrinsics.i(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objSave = save((LinkAnnotation.Clickable) item7, ClickableSaver, saverScope);
                break;
            case 7:
                Object item8 = range.getItem();
                Intrinsics.i(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objSave = save(((StringAnnotation) item8).getValue());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return v.e(save(annotationType), objSave, save(Integer.valueOf(range.getStart())), save(Integer.valueOf(range.getEnd())), save(range.getTag()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range AnnotationRangeSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        ParagraphStyle paragraphStyleRestore = null;
        clickableRestore = null;
        LinkAnnotation.Clickable clickableRestore = null;
        urlRestore = null;
        LinkAnnotation.Url urlRestore = null;
        urlAnnotationRestore = null;
        UrlAnnotation urlAnnotationRestore = null;
        verbatimTtsAnnotationRestore = null;
        VerbatimTtsAnnotation verbatimTtsAnnotationRestore = null;
        spanStyleRestore = null;
        SpanStyle spanStyleRestore = null;
        paragraphStyleRestore = null;
        AnnotationType annotationType = obj3 != null ? (AnnotationType) obj3 : null;
        Intrinsics.h(annotationType);
        Object obj4 = list.get(2);
        Integer num = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.h(num);
        int iIntValue = num.intValue();
        Object obj5 = list.get(3);
        Integer num2 = obj5 != null ? (Integer) obj5 : null;
        Intrinsics.h(num2);
        int iIntValue2 = num2.intValue();
        Object obj6 = list.get(4);
        String str = obj6 != null ? (String) obj6 : null;
        Intrinsics.h(str);
        switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object obj7 = list.get(1);
                Saver<ParagraphStyle, Object> saver = ParagraphStyleSaver;
                if ((!Intrinsics.f(obj7, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj7 != null) {
                    paragraphStyleRestore = saver.restore(obj7);
                }
                Intrinsics.h(paragraphStyleRestore);
                return new AnnotatedString.Range(paragraphStyleRestore, iIntValue, iIntValue2, str);
            case 2:
                Object obj8 = list.get(1);
                Saver<SpanStyle, Object> saver2 = SpanStyleSaver;
                if ((!Intrinsics.f(obj8, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    spanStyleRestore = saver2.restore(obj8);
                }
                Intrinsics.h(spanStyleRestore);
                return new AnnotatedString.Range(spanStyleRestore, iIntValue, iIntValue2, str);
            case 3:
                Object obj9 = list.get(1);
                Saver<VerbatimTtsAnnotation, Object> saver3 = VerbatimTtsAnnotationSaver;
                if ((!Intrinsics.f(obj9, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    verbatimTtsAnnotationRestore = saver3.restore(obj9);
                }
                Intrinsics.h(verbatimTtsAnnotationRestore);
                return new AnnotatedString.Range(verbatimTtsAnnotationRestore, iIntValue, iIntValue2, str);
            case 4:
                Object obj10 = list.get(1);
                Saver<UrlAnnotation, Object> saver4 = UrlAnnotationSaver;
                if ((!Intrinsics.f(obj10, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    urlAnnotationRestore = saver4.restore(obj10);
                }
                Intrinsics.h(urlAnnotationRestore);
                return new AnnotatedString.Range(urlAnnotationRestore, iIntValue, iIntValue2, str);
            case 5:
                Object obj11 = list.get(1);
                Saver<LinkAnnotation.Url, Object> saver5 = LinkSaver;
                if ((!Intrinsics.f(obj11, Boolean.FALSE) || (saver5 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    urlRestore = saver5.restore(obj11);
                }
                Intrinsics.h(urlRestore);
                return new AnnotatedString.Range(urlRestore, iIntValue, iIntValue2, str);
            case 6:
                Object obj12 = list.get(1);
                Saver<LinkAnnotation.Clickable, Object> saver6 = ClickableSaver;
                if ((!Intrinsics.f(obj12, Boolean.FALSE) || (saver6 instanceof NonNullValueClassSaver)) && obj12 != null) {
                    clickableRestore = saver6.restore(obj12);
                }
                Intrinsics.h(clickableRestore);
                return new AnnotatedString.Range(clickableRestore, iIntValue, iIntValue2, str);
            case 7:
                Object obj13 = list.get(1);
                String str2 = obj13 != null ? (String) obj13 : null;
                Intrinsics.h(str2);
                return new AnnotatedString.Range(StringAnnotation.m2924boximpl(StringAnnotation.m2925constructorimpl(str2)), iIntValue, iIntValue2, str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object BaselineShiftSaver$lambda$0(SaverScope saverScope, BaselineShift baselineShift) {
        return Float.valueOf(baselineShift.getMultiplier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaselineShift BaselineShiftSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Float");
        return BaselineShift.m3133boximpl(BaselineShift.m3134constructorimpl(((Float) obj2).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ClickableSaver$lambda$0(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
        return v.e(save(clickable.getTag()), save(clickable.getStyles(), TextLinkStylesSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Clickable ClickableSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.h(str);
        Object obj4 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        return new LinkAnnotation.Clickable(str, ((!Intrinsics.f(obj4, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontStyleSaver$lambda$0(SaverScope saverScope, FontStyle fontStyle) {
        return save(Integer.valueOf(fontStyle.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontStyle FontStyleSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return FontStyle.m3013boximpl(FontStyle.m3014constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontSynthesisSaver$lambda$0(SaverScope saverScope, FontSynthesis fontSynthesis) {
        return Integer.valueOf(fontSynthesis.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontSynthesis FontSynthesisSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return FontSynthesis.m3022boximpl(FontSynthesis.m3023constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object FontWeightSaver$lambda$0(SaverScope saverScope, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight FontWeightSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj2).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HyphensSaver$lambda$0(SaverScope saverScope, Hyphens hyphens) {
        return Integer.valueOf(hyphens.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hyphens HyphensSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return Hyphens.m3143boximpl(Hyphens.m3144constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleAlignmentSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Alignment alignment) {
        return Float.valueOf(alignment.getTopRatio());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Alignment LineHeightStyleAlignmentSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Float");
        return LineHeightStyle.Alignment.m3186boximpl(LineHeightStyle.Alignment.m3187constructorimpl(((Float) obj2).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleModeSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Mode mode) {
        return Integer.valueOf(mode.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Mode LineHeightStyleModeSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.Mode.m3195boximpl(LineHeightStyle.Mode.m3196constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleSaver$lambda$0(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
        return v.e(save(LineHeightStyle.Alignment.m3186boximpl(lineHeightStyle.getAlignment()), getSaver(LineHeightStyle.Alignment.INSTANCE), saverScope), save(LineHeightStyle.Trim.m3205boximpl(lineHeightStyle.getTrim()), getSaver(LineHeightStyle.Trim.INSTANCE), saverScope), save(LineHeightStyle.Mode.m3195boximpl(lineHeightStyle.getMode()), getSaver(LineHeightStyle.Mode.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle LineHeightStyleSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Saver<LineHeightStyle.Alignment, Object> saver = getSaver(LineHeightStyle.Alignment.INSTANCE);
        Boolean bool = Boolean.FALSE;
        LineHeightStyle.Alignment alignmentRestore = ((!Intrinsics.f(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Intrinsics.h(alignmentRestore);
        float topRatio = alignmentRestore.getTopRatio();
        Object obj4 = list.get(1);
        Saver<LineHeightStyle.Trim, Object> saver2 = getSaver(LineHeightStyle.Trim.INSTANCE);
        LineHeightStyle.Trim trimRestore = ((!Intrinsics.f(obj4, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver2.restore(obj4) : null;
        Intrinsics.h(trimRestore);
        int value = trimRestore.getValue();
        Object obj5 = list.get(2);
        Saver<LineHeightStyle.Mode, Object> saver3 = getSaver(LineHeightStyle.Mode.INSTANCE);
        LineHeightStyle.Mode modeRestore = ((!Intrinsics.f(obj5, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver3.restore(obj5) : null;
        Intrinsics.h(modeRestore);
        return new LineHeightStyle(topRatio, value, modeRestore.getValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineHeightStyleTrimSaver$lambda$0(SaverScope saverScope, LineHeightStyle.Trim trim) {
        return Integer.valueOf(trim.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.Trim LineHeightStyleTrimSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.Trim.m3205boximpl(LineHeightStyle.Trim.m3206constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LinkSaver$lambda$0(SaverScope saverScope, LinkAnnotation.Url url2) {
        return v.e(save(url2.getUrl()), save(url2.getStyles(), TextLinkStylesSaver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAnnotation.Url LinkSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        TextLinkStyles textLinkStylesRestore = null;
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.h(str);
        Object obj4 = list.get(1);
        Saver<TextLinkStyles, Object> saver = TextLinkStylesSaver;
        if ((!Intrinsics.f(obj4, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) {
            textLinkStylesRestore = saver.restore(obj4);
        }
        return new LinkAnnotation.Url(str, textLinkStylesRestore, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleListSaver$lambda$0(SaverScope saverScope, LocaleList localeList) {
        List<Locale> localeList2 = localeList.getLocaleList();
        ArrayList arrayList = new ArrayList(localeList2.size());
        int size = localeList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(save(localeList2.get(i), getSaver(Locale.INSTANCE), saverScope));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList LocaleListSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            Saver<Locale, Object> saver = getSaver(Locale.INSTANCE);
            Locale localeRestore = null;
            if ((!Intrinsics.f(obj3, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) {
                localeRestore = saver.restore(obj3);
            }
            Intrinsics.h(localeRestore);
            arrayList.add(localeRestore);
        }
        return new LocaleList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LocaleSaver$lambda$0(SaverScope saverScope, Locale locale) {
        return locale.toLanguageTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale LocaleSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        return new Locale((String) obj2);
    }

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final Function2<? super SaverScope, ? super Original, ? extends Saveable> function2, final Function1<? super Saveable, ? extends Original> function1) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt.NonNullValueClassSaver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable value) {
                return (Original) function1.invoke(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) function2.invoke(saverScope, original);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OffsetSaver$lambda$0(SaverScope saverScope, Offset offset) {
        return offset == null ? false : Offset.m1832equalsimpl0(offset.getPackedValue(), Offset.INSTANCE.m1844getUnspecifiedF1C5BW0()) ? Boolean.FALSE : v.e(save(Float.valueOf(Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)))), save(Float.valueOf(Float.intBitsToFloat((int) (offset.getPackedValue() & BodyPartID.bodyIdMax)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset OffsetSaver$lambda$1(Object obj2) {
        if (Intrinsics.f(obj2, Boolean.FALSE)) {
            return Offset.m1826boximpl(Offset.INSTANCE.m1844getUnspecifiedF1C5BW0());
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Float f = obj3 != null ? (Float) obj3 : null;
        Intrinsics.h(f);
        float fFloatValue = f.floatValue();
        Object obj4 = list.get(1);
        Float f4 = obj4 != null ? (Float) obj4 : null;
        Intrinsics.h(f4);
        return Offset.m1826boximpl(Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f4.floatValue())) & BodyPartID.bodyIdMax)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ParagraphStyleSaver$lambda$0(SaverScope saverScope, ParagraphStyle paragraphStyle) {
        return v.e(save(TextAlign.m3216boximpl(paragraphStyle.getTextAlign()), getSaver(TextAlign.INSTANCE), saverScope), save(TextDirection.m3230boximpl(paragraphStyle.getTextDirection()), getSaver(TextDirection.INSTANCE), saverScope), save(TextUnit.m3364boximpl(paragraphStyle.getLineHeight()), getSaver(TextUnit.INSTANCE), saverScope), save(paragraphStyle.getTextIndent(), getSaver(TextIndent.INSTANCE), saverScope), save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.INSTANCE), saverScope), save(paragraphStyle.getLineHeightStyle(), getSaver(LineHeightStyle.INSTANCE), saverScope), save(LineBreak.m3153boximpl(paragraphStyle.getLineBreak()), Savers_androidKt.getSaver(LineBreak.INSTANCE), saverScope), save(Hyphens.m3143boximpl(paragraphStyle.getHyphens()), getSaver(Hyphens.INSTANCE), saverScope), save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle ParagraphStyleSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Saver<TextAlign, Object> saver = getSaver(TextAlign.INSTANCE);
        Boolean bool = Boolean.FALSE;
        TextMotion textMotionRestore = null;
        TextAlign textAlignRestore = ((!Intrinsics.f(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Intrinsics.h(textAlignRestore);
        int value = textAlignRestore.getValue();
        Object obj4 = list.get(1);
        Saver<TextDirection, Object> saver2 = getSaver(TextDirection.INSTANCE);
        TextDirection textDirectionRestore = ((!Intrinsics.f(obj4, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver2.restore(obj4) : null;
        Intrinsics.h(textDirectionRestore);
        int value2 = textDirectionRestore.getValue();
        Object obj5 = list.get(2);
        Saver<TextUnit, Object> saver3 = getSaver(TextUnit.INSTANCE);
        TextUnit textUnitRestore = ((!Intrinsics.f(obj5, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver3.restore(obj5) : null;
        Intrinsics.h(textUnitRestore);
        long packedValue = textUnitRestore.getPackedValue();
        Object obj6 = list.get(3);
        Saver<TextIndent, Object> saver4 = getSaver(TextIndent.INSTANCE);
        TextIndent textIndentRestore = ((!Intrinsics.f(obj6, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver4.restore(obj6) : null;
        Object obj7 = list.get(4);
        Saver<PlatformParagraphStyle, Object> saver5 = Savers_androidKt.getSaver(PlatformParagraphStyle.INSTANCE);
        PlatformParagraphStyle platformParagraphStyleRestore = ((!Intrinsics.f(obj7, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver5.restore(obj7) : null;
        Object obj8 = list.get(5);
        Saver<LineHeightStyle, Object> saver6 = getSaver(LineHeightStyle.INSTANCE);
        LineHeightStyle lineHeightStyleRestore = ((!Intrinsics.f(obj8, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver6.restore(obj8) : null;
        Object obj9 = list.get(6);
        Saver<LineBreak, Object> saver7 = Savers_androidKt.getSaver(LineBreak.INSTANCE);
        LineBreak lineBreakRestore = ((!Intrinsics.f(obj9, bool) || (saver7 instanceof NonNullValueClassSaver)) && obj9 != null) ? saver7.restore(obj9) : null;
        Intrinsics.h(lineBreakRestore);
        int mask = lineBreakRestore.getMask();
        Object obj10 = list.get(7);
        Saver<Hyphens, Object> saver8 = getSaver(Hyphens.INSTANCE);
        Hyphens hyphensRestore = ((!Intrinsics.f(obj10, bool) || (saver8 instanceof NonNullValueClassSaver)) && obj10 != null) ? saver8.restore(obj10) : null;
        Intrinsics.h(hyphensRestore);
        int value3 = hyphensRestore.getValue();
        Object obj11 = list.get(8);
        Saver<TextMotion, Object> saver9 = Savers_androidKt.getSaver(TextMotion.INSTANCE);
        if ((!Intrinsics.f(obj11, bool) || (saver9 instanceof NonNullValueClassSaver)) && obj11 != null) {
            textMotionRestore = saver9.restore(obj11);
        }
        return new ParagraphStyle(value, value2, packedValue, textIndentRestore, platformParagraphStyleRestore, lineHeightStyleRestore, mask, value3, textMotionRestore, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ShadowSaver$lambda$0(SaverScope saverScope, Shadow shadow) {
        return v.e(save(Color.m1972boximpl(shadow.getColor()), getSaver(Color.INSTANCE), saverScope), save(Offset.m1826boximpl(shadow.getOffset()), getSaver(Offset.INSTANCE), saverScope), save(Float.valueOf(shadow.getBlurRadius())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow ShadowSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Saver<Color, Object> saver = getSaver(Color.INSTANCE);
        Boolean bool = Boolean.FALSE;
        Color colorRestore = ((!Intrinsics.f(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Intrinsics.h(colorRestore);
        long value = colorRestore.getValue();
        Object obj4 = list.get(1);
        Saver<Offset, Object> saver2 = getSaver(Offset.INSTANCE);
        Offset offsetRestore = ((!Intrinsics.f(obj4, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj4 != null) ? saver2.restore(obj4) : null;
        Intrinsics.h(offsetRestore);
        long packedValue = offsetRestore.getPackedValue();
        Object obj5 = list.get(2);
        Float f = obj5 != null ? (Float) obj5 : null;
        Intrinsics.h(f);
        return new Shadow(value, packedValue, f.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SpanStyleSaver$lambda$0(SaverScope saverScope, SpanStyle spanStyle) {
        Color colorM1972boximpl = Color.m1972boximpl(spanStyle.m2917getColor0d7_KjU());
        Color.Companion companion = Color.INSTANCE;
        Object objSave = save(colorM1972boximpl, getSaver(companion), saverScope);
        TextUnit textUnitM3364boximpl = TextUnit.m3364boximpl(spanStyle.getFontSize());
        TextUnit.Companion companion2 = TextUnit.INSTANCE;
        return v.e(objSave, save(textUnitM3364boximpl, getSaver(companion2), saverScope), save(spanStyle.getFontWeight(), getSaver(FontWeight.INSTANCE), saverScope), save(spanStyle.getFontStyle(), getSaver(FontStyle.INSTANCE), saverScope), save(spanStyle.getFontSynthesis(), getSaver(FontSynthesis.INSTANCE), saverScope), save(-1), save(spanStyle.getFontFeatureSettings()), save(TextUnit.m3364boximpl(spanStyle.getLetterSpacing()), getSaver(companion2), saverScope), save(spanStyle.getBaselineShift(), getSaver(BaselineShift.INSTANCE), saverScope), save(spanStyle.getTextGeometricTransform(), getSaver(TextGeometricTransform.INSTANCE), saverScope), save(spanStyle.getLocaleList(), getSaver(LocaleList.INSTANCE), saverScope), save(Color.m1972boximpl(spanStyle.getBackground()), getSaver(companion), saverScope), save(spanStyle.getBackground(), getSaver(TextDecoration.INSTANCE), saverScope), save(spanStyle.getShadow(), getSaver(Shadow.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
          (r1v1 androidx.compose.ui.text.SpanStyle) from 0x0101: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
          (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00f9: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final androidx.compose.ui.text.SpanStyle SpanStyleSaver$lambda$1(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SaversKt.SpanStyleSaver$lambda$1(java.lang.Object):androidx.compose.ui.text.SpanStyle");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextAlignSaver$lambda$0(SaverScope saverScope, TextAlign textAlign) {
        return Integer.valueOf(textAlign.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextAlign TextAlignSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return TextAlign.m3216boximpl(TextAlign.m3217constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDecorationSaver$lambda$0(SaverScope saverScope, TextDecoration textDecoration) {
        return Integer.valueOf(textDecoration.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDecoration TextDecorationSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return new TextDecoration(((Integer) obj2).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextDirectionSaver$lambda$0(SaverScope saverScope, TextDirection textDirection) {
        return Integer.valueOf(textDirection.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextDirection TextDirectionSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Int");
        return TextDirection.m3230boximpl(TextDirection.m3231constructorimpl(((Integer) obj2).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextGeometricTransformSaver$lambda$0(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
        return v.e(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform TextGeometricTransformSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj2;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextIndentSaver$lambda$0(SaverScope saverScope, TextIndent textIndent) {
        TextUnit textUnitM3364boximpl = TextUnit.m3364boximpl(textIndent.getFirstLine());
        TextUnit.Companion companion = TextUnit.INSTANCE;
        return v.e(save(textUnitM3364boximpl, getSaver(companion), saverScope), save(TextUnit.m3364boximpl(textIndent.getRestLine()), getSaver(companion), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent TextIndentSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        TextUnit.Companion companion = TextUnit.INSTANCE;
        Saver<TextUnit, Object> saver = getSaver(companion);
        Boolean bool = Boolean.FALSE;
        TextUnit textUnitRestore = null;
        TextUnit textUnitRestore2 = ((!Intrinsics.f(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Intrinsics.h(textUnitRestore2);
        long packedValue = textUnitRestore2.getPackedValue();
        Object obj4 = list.get(1);
        Saver<TextUnit, Object> saver2 = getSaver(companion);
        if ((!Intrinsics.f(obj4, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj4 != null) {
            textUnitRestore = saver2.restore(obj4);
        }
        Intrinsics.h(textUnitRestore);
        return new TextIndent(packedValue, textUnitRestore.getPackedValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextLinkStylesSaver$lambda$0(SaverScope saverScope, TextLinkStyles textLinkStyles) {
        SpanStyle style = textLinkStyles.getStyle();
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        return v.e(save(style, saver, saverScope), save(textLinkStyles.getFocusedStyle(), saver, saverScope), save(textLinkStyles.getHoveredStyle(), saver, saverScope), save(textLinkStyles.getPressedStyle(), saver, saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLinkStyles TextLinkStylesSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Saver<SpanStyle, Object> saver = SpanStyleSaver;
        Boolean bool = Boolean.FALSE;
        SpanStyle spanStyleRestore = null;
        SpanStyle spanStyleRestore2 = ((!Intrinsics.f(obj3, bool) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        Object obj4 = list.get(1);
        SpanStyle spanStyleRestore3 = ((!Intrinsics.f(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
        Object obj5 = list.get(2);
        SpanStyle spanStyleRestore4 = ((!Intrinsics.f(obj5, bool) || (saver instanceof NonNullValueClassSaver)) && obj5 != null) ? saver.restore(obj5) : null;
        Object obj6 = list.get(3);
        if ((!Intrinsics.f(obj6, bool) || (saver instanceof NonNullValueClassSaver)) && obj6 != null) {
            spanStyleRestore = saver.restore(obj6);
        }
        return new TextLinkStyles(spanStyleRestore2, spanStyleRestore3, spanStyleRestore4, spanStyleRestore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object TextRangeSaver$lambda$0(SaverScope saverScope, TextRange textRange) {
        return v.e(save(Integer.valueOf(TextRange.m2959getStartimpl(textRange.getPackedValue()))), save(Integer.valueOf(TextRange.m2954getEndimpl(textRange.getPackedValue()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextRange TextRangeSaver$lambda$1(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.h(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(1);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.h(num2);
        return TextRange.m2947boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitSaver$lambda$0(SaverScope saverScope, TextUnit textUnit) {
        return textUnit == null ? false : TextUnit.m3367equalsimpl0(textUnit.getPackedValue(), TextUnit.INSTANCE.m3375getUnspecifiedXSAIIZE()) ? Boolean.FALSE : v.e(save(Float.valueOf(TextUnit.m3370getValueimpl(textUnit.getPackedValue()))), save(TextUnitType.m3381boximpl(TextUnit.m3369getTypeUIouoOA(textUnit.getPackedValue())), getSaver(TextUnitType.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnit TextUnitSaver$lambda$1(Object obj2) {
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.f(obj2, bool)) {
            return TextUnit.m3364boximpl(TextUnit.INSTANCE.m3375getUnspecifiedXSAIIZE());
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj2;
        Object obj3 = list.get(0);
        TextUnitType textUnitTypeRestore = null;
        Float f = obj3 != null ? (Float) obj3 : null;
        Intrinsics.h(f);
        float fFloatValue = f.floatValue();
        Object obj4 = list.get(1);
        Saver<TextUnitType, Object> saver = getSaver(TextUnitType.INSTANCE);
        if ((!Intrinsics.f(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) {
            textUnitTypeRestore = saver.restore(obj4);
        }
        Intrinsics.h(textUnitTypeRestore);
        return TextUnit.m3364boximpl(TextUnitKt.m3376TextUnitanM5pPY(fFloatValue, textUnitTypeRestore.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextUnitTypeSaver$lambda$0(SaverScope saverScope, TextUnitType textUnitType) {
        long type = textUnitType.getType();
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3384equalsimpl0(type, companion.m3388getEmUIouoOA())) {
            return 0;
        }
        if (TextUnitType.m3384equalsimpl0(type, companion.m3389getSpUIouoOA())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextUnitType TextUnitTypeSaver$lambda$1(Object obj2) {
        return Intrinsics.f(obj2, 0) ? TextUnitType.m3381boximpl(TextUnitType.INSTANCE.m3388getEmUIouoOA()) : Intrinsics.f(obj2, 1) ? TextUnitType.m3381boximpl(TextUnitType.INSTANCE.m3389getSpUIouoOA()) : TextUnitType.m3381boximpl(TextUnitType.INSTANCE.m3390getUnspecifiedUIouoOA());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object UrlAnnotationSaver$lambda$0(SaverScope saverScope, UrlAnnotation urlAnnotation) {
        return save(urlAnnotation.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation UrlAnnotationSaver$lambda$1(Object obj2) {
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.h(str);
        return new UrlAnnotation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object VerbatimTtsAnnotationSaver$lambda$0(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return save(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation VerbatimTtsAnnotationSaver$lambda$1(Object obj2) {
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.h(str);
        return new VerbatimTtsAnnotation(str);
    }

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    public static final <T> T save(T t2) {
        return t2;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, @NotNull T t2, @NotNull SaverScope saverScope) {
        Object objSave;
        return (original == null || (objSave = t2.save(saverScope, original)) == null) ? Boolean.FALSE : objSave;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        return ColorSaver;
    }

    @NotNull
    public static final Saver<TextAlign, Object> getSaver(@NotNull TextAlign.Companion companion) {
        return TextAlignSaver;
    }

    @NotNull
    public static final Saver<TextDirection, Object> getSaver(@NotNull TextDirection.Companion companion) {
        return TextDirectionSaver;
    }

    @NotNull
    public static final Saver<Hyphens, Object> getSaver(@NotNull Hyphens.Companion companion) {
        return HyphensSaver;
    }

    @NotNull
    public static final Saver<FontStyle, Object> getSaver(@NotNull FontStyle.Companion companion) {
        return FontStyleSaver;
    }

    @NotNull
    public static final Saver<FontSynthesis, Object> getSaver(@NotNull FontSynthesis.Companion companion) {
        return FontSynthesisSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<TextUnitType, Object> getSaver(@NotNull TextUnitType.Companion companion) {
        return TextUnitTypeSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        return LocaleSaver;
    }

    @NotNull
    public static final Saver<LineHeightStyle, Object> getSaver(@NotNull LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }

    private static final Saver<LineHeightStyle.Alignment, Object> getSaver(LineHeightStyle.Alignment.Companion companion) {
        return LineHeightStyleAlignmentSaver;
    }

    private static final Saver<LineHeightStyle.Trim, Object> getSaver(LineHeightStyle.Trim.Companion companion) {
        return LineHeightStyleTrimSaver;
    }

    private static final Saver<LineHeightStyle.Mode, Object> getSaver(LineHeightStyle.Mode.Companion companion) {
        return LineHeightStyleModeSaver;
    }
}
