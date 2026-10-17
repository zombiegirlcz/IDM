package androidx.compose.material3.tokens;

import androidx.compose.ui.graphics.ColorKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¹\u0001\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u0017\u0010s\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bs\u0010\u0006\u001a\u0004\bt\u0010\bR\u0017\u0010u\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bw\u0010\u0006\u001a\u0004\bx\u0010\bR\u0017\u0010y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\by\u0010\u0006\u001a\u0004\bz\u0010\bR\u0017\u0010{\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b}\u0010\u0006\u001a\u0004\b~\u0010\bR\u0018\u0010\u007f\u001a\u00020\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0006\u001a\u0005\b\u0080\u0001\u0010\bR\u001a\u0010\u0081\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0006\u001a\u0005\b\u0082\u0001\u0010\bR\u001a\u0010\u0083\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0006\u001a\u0005\b\u0084\u0001\u0010\bR\u001a\u0010\u0085\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR\u001a\u0010\u0087\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0006\u001a\u0005\b\u008a\u0001\u0010\bR\u001a\u0010\u008b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u008c\u0001\u0010\bR\u001a\u0010\u008d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR\u001a\u0010\u0091\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0006\u001a\u0005\b\u0092\u0001\u0010\bR\u001a\u0010\u0093\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0006\u001a\u0005\b\u0094\u0001\u0010\bR\u001a\u0010\u0095\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0006\u001a\u0005\b\u0096\u0001\u0010\bR\u001a\u0010\u0097\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0006\u001a\u0005\b\u0098\u0001\u0010\bR\u001a\u0010\u0099\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001a\u0010\u009d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0006\u001a\u0005\b\u009e\u0001\u0010\bR\u001a\u0010\u009f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001a\u0010¡\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001a\u0010£\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0006\u001a\u0005\b¤\u0001\u0010\bR\u001a\u0010¥\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR\u001a\u0010§\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\bR\u001a\u0010©\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\bR\u001a\u0010«\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0006\u001a\u0005\b¬\u0001\u0010\bR\u001a\u0010\u00ad\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0006\u001a\u0005\b®\u0001\u0010\bR\u001a\u0010¯\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0006\u001a\u0005\b°\u0001\u0010\bR\u001a\u0010±\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0006\u001a\u0005\b²\u0001\u0010\bR\u001a\u0010³\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0006\u001a\u0005\b´\u0001\u0010\bR\u001a\u0010µ\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0006\u001a\u0005\b¶\u0001\u0010\bR\u001a\u0010·\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0006\u001a\u0005\b¸\u0001\u0010\bR\u001a\u0010¹\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001a\u0010»\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0006\u001a\u0005\b¼\u0001\u0010\b¨\u0006½\u0001"}, d2 = {"Landroidx/compose/material3/tokens/PaletteTokens;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "Black", "J", "getBlack-0d7_KjU", "()J", "Error0", "getError0-0d7_KjU", "Error10", "getError10-0d7_KjU", "Error100", "getError100-0d7_KjU", "Error20", "getError20-0d7_KjU", "Error30", "getError30-0d7_KjU", "Error40", "getError40-0d7_KjU", "Error50", "getError50-0d7_KjU", "Error60", "getError60-0d7_KjU", "Error70", "getError70-0d7_KjU", "Error80", "getError80-0d7_KjU", "Error90", "getError90-0d7_KjU", "Error95", "getError95-0d7_KjU", "Error99", "getError99-0d7_KjU", "Neutral0", "getNeutral0-0d7_KjU", "Neutral10", "getNeutral10-0d7_KjU", "Neutral100", "getNeutral100-0d7_KjU", "Neutral12", "getNeutral12-0d7_KjU", "Neutral17", "getNeutral17-0d7_KjU", "Neutral20", "getNeutral20-0d7_KjU", "Neutral22", "getNeutral22-0d7_KjU", "Neutral24", "getNeutral24-0d7_KjU", "Neutral30", "getNeutral30-0d7_KjU", "Neutral4", "getNeutral4-0d7_KjU", "Neutral40", "getNeutral40-0d7_KjU", "Neutral50", "getNeutral50-0d7_KjU", "Neutral6", "getNeutral6-0d7_KjU", "Neutral60", "getNeutral60-0d7_KjU", "Neutral70", "getNeutral70-0d7_KjU", "Neutral80", "getNeutral80-0d7_KjU", "Neutral87", "getNeutral87-0d7_KjU", "Neutral90", "getNeutral90-0d7_KjU", "Neutral92", "getNeutral92-0d7_KjU", "Neutral94", "getNeutral94-0d7_KjU", "Neutral95", "getNeutral95-0d7_KjU", "Neutral96", "getNeutral96-0d7_KjU", "Neutral98", "getNeutral98-0d7_KjU", "Neutral99", "getNeutral99-0d7_KjU", "NeutralVariant0", "getNeutralVariant0-0d7_KjU", "NeutralVariant10", "getNeutralVariant10-0d7_KjU", "NeutralVariant100", "getNeutralVariant100-0d7_KjU", "NeutralVariant20", "getNeutralVariant20-0d7_KjU", "NeutralVariant30", "getNeutralVariant30-0d7_KjU", "NeutralVariant40", "getNeutralVariant40-0d7_KjU", "NeutralVariant50", "getNeutralVariant50-0d7_KjU", "NeutralVariant60", "getNeutralVariant60-0d7_KjU", "NeutralVariant70", "getNeutralVariant70-0d7_KjU", "NeutralVariant80", "getNeutralVariant80-0d7_KjU", "NeutralVariant90", "getNeutralVariant90-0d7_KjU", "NeutralVariant95", "getNeutralVariant95-0d7_KjU", "NeutralVariant99", "getNeutralVariant99-0d7_KjU", "Primary0", "getPrimary0-0d7_KjU", "Primary10", "getPrimary10-0d7_KjU", "Primary100", "getPrimary100-0d7_KjU", "Primary20", "getPrimary20-0d7_KjU", "Primary30", "getPrimary30-0d7_KjU", "Primary40", "getPrimary40-0d7_KjU", "Primary50", "getPrimary50-0d7_KjU", "Primary60", "getPrimary60-0d7_KjU", "Primary70", "getPrimary70-0d7_KjU", "Primary80", "getPrimary80-0d7_KjU", "Primary90", "getPrimary90-0d7_KjU", "Primary95", "getPrimary95-0d7_KjU", "Primary99", "getPrimary99-0d7_KjU", "Secondary0", "getSecondary0-0d7_KjU", "Secondary10", "getSecondary10-0d7_KjU", "Secondary100", "getSecondary100-0d7_KjU", "Secondary20", "getSecondary20-0d7_KjU", "Secondary30", "getSecondary30-0d7_KjU", "Secondary40", "getSecondary40-0d7_KjU", "Secondary50", "getSecondary50-0d7_KjU", "Secondary60", "getSecondary60-0d7_KjU", "Secondary70", "getSecondary70-0d7_KjU", "Secondary80", "getSecondary80-0d7_KjU", "Secondary90", "getSecondary90-0d7_KjU", "Secondary95", "getSecondary95-0d7_KjU", "Secondary99", "getSecondary99-0d7_KjU", "Tertiary0", "getTertiary0-0d7_KjU", "Tertiary10", "getTertiary10-0d7_KjU", "Tertiary100", "getTertiary100-0d7_KjU", "Tertiary20", "getTertiary20-0d7_KjU", "Tertiary30", "getTertiary30-0d7_KjU", "Tertiary40", "getTertiary40-0d7_KjU", "Tertiary50", "getTertiary50-0d7_KjU", "Tertiary60", "getTertiary60-0d7_KjU", "Tertiary70", "getTertiary70-0d7_KjU", "Tertiary80", "getTertiary80-0d7_KjU", "Tertiary90", "getTertiary90-0d7_KjU", "Tertiary95", "getTertiary95-0d7_KjU", "Tertiary99", "getTertiary99-0d7_KjU", "White", "getWhite-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaletteTokens {

    @NotNull
    public static final PaletteTokens INSTANCE = new PaletteTokens();
    private static final long Black = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error10 = ColorKt.Color$default(65, 14, 11, 0, 8, null);
    private static final long Error100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Error20 = ColorKt.Color$default(96, 20, 16, 0, 8, null);
    private static final long Error30 = ColorKt.Color$default(140, 29, 24, 0, 8, null);
    private static final long Error40 = ColorKt.Color$default(179, 38, 30, 0, 8, null);
    private static final long Error50 = ColorKt.Color$default(220, 54, 46, 0, 8, null);
    private static final long Error60 = ColorKt.Color$default(Constants.TAG_E4_CUSTOMER_DATA, 105, 98, 0, 8, null);
    private static final long Error70 = ColorKt.Color$default(Constants.TAG_OS_VERSION, 146, 142, 0, 8, null);
    private static final long Error80 = ColorKt.Color$default(242, SyslogConstants.LOG_LOCAL7, 181, 0, 8, null);
    private static final long Error90 = ColorKt.Color$default(Constants.TAG_RESOURCE_FILE_VERSION, 222, 220, 0, 8, null);
    private static final long Error95 = ColorKt.Color$default(Constants.TAG_FC_SPEED_MODE, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 0, 8, null);
    private static final long Error99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, Constants.TAG_RESOURCE_FILE_VERSION, 0, 8, null);
    private static final long Neutral0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Neutral10 = ColorKt.Color$default(29, 27, 32, 0, 8, null);
    private static final long Neutral100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Neutral12 = ColorKt.Color$default(33, 31, 38, 0, 8, null);
    private static final long Neutral17 = ColorKt.Color$default(43, 41, 48, 0, 8, null);
    private static final long Neutral20 = ColorKt.Color$default(50, 47, 53, 0, 8, null);
    private static final long Neutral22 = ColorKt.Color$default(54, 52, 59, 0, 8, null);
    private static final long Neutral24 = ColorKt.Color$default(59, 56, 62, 0, 8, null);
    private static final long Neutral30 = ColorKt.Color$default(72, 70, 76, 0, 8, null);
    private static final long Neutral4 = ColorKt.Color$default(15, 13, 19, 0, 8, null);
    private static final long Neutral40 = ColorKt.Color$default(96, 93, 100, 0, 8, null);
    private static final long Neutral50 = ColorKt.Color$default(121, LDSFile.EF_DG4_TAG, ISO781611.SMT_TAG, 0, 8, null);
    private static final long Neutral6 = ColorKt.Color$default(20, 18, 24, 0, 8, null);
    private static final long Neutral60 = ColorKt.Color$default(147, 143, 150, 0, 8, null);
    private static final long Neutral70 = ColorKt.Color$default(174, 169, 177, 0, 8, null);
    private static final long Neutral80 = ColorKt.Color$default(202, Constants.TAG_BATTERY_STATE, Constants.TAG_KSN_FORMATS, 0, 8, null);
    private static final long Neutral87 = ColorKt.Color$default(222, Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 0, 8, null);
    private static final long Neutral90 = ColorKt.Color$default(230, BERTags.FLAGS, Constants.TAG_USB_CAPABILITY, 0, 8, null);
    private static final long Neutral92 = ColorKt.Color$default(Constants.TAG_OS_VERSION, 230, 240, 0, 8, null);
    private static final long Neutral94 = ColorKt.Color$default(Constants.TAG_F3_BUILD_CONFIGURATION, Constants.TAG_MPOS_MODULE_STATE, Constants.TAG_BLE_FIRMWARE_VERSION, 0, 8, null);
    private static final long Neutral95 = ColorKt.Color$default(Constants.TAG_F5, 239, Constants.TAG_BLE_FIRMWARE_VERSION, 0, 8, null);
    private static final long Neutral96 = ColorKt.Color$default(Constants.TAG_BLE_FIRMWARE_VERSION, 242, Constants.TAG_SUPPORTED_LOCALE_LIST, 0, 8, null);
    private static final long Neutral98 = ColorKt.Color$default(254, Constants.TAG_BLE_FIRMWARE_VERSION, 255, 0, 8, null);
    private static final long Neutral99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, 255, 0, 8, null);
    private static final long NeutralVariant0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long NeutralVariant10 = ColorKt.Color$default(29, 26, 34, 0, 8, null);
    private static final long NeutralVariant100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long NeutralVariant20 = ColorKt.Color$default(50, 47, 55, 0, 8, null);
    private static final long NeutralVariant30 = ColorKt.Color$default(73, 69, 79, 0, 8, null);
    private static final long NeutralVariant40 = ColorKt.Color$default(96, 93, 102, 0, 8, null);
    private static final long NeutralVariant50 = ColorKt.Color$default(121, 116, 126, 0, 8, null);
    private static final long NeutralVariant60 = ColorKt.Color$default(147, 143, 153, 0, 8, null);
    private static final long NeutralVariant70 = ColorKt.Color$default(174, 169, 180, 0, 8, null);
    private static final long NeutralVariant80 = ColorKt.Color$default(202, 196, 208, 0, 8, null);
    private static final long NeutralVariant90 = ColorKt.Color$default(Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, BERTags.FLAGS, Constants.TAG_OS_VERSION, 0, 8, null);
    private static final long NeutralVariant95 = ColorKt.Color$default(Constants.TAG_F5, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, Constants.TAG_SUPPORTED_LOCALE_LIST, 0, 8, null);
    private static final long NeutralVariant99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, 254, 0, 8, null);
    private static final long Primary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Primary10 = ColorKt.Color$default(33, 0, 93, 0, 8, null);
    private static final long Primary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Primary20 = ColorKt.Color$default(56, 30, 114, 0, 8, null);
    private static final long Primary30 = ColorKt.Color$default(79, 55, 139, 0, 8, null);
    private static final long Primary40 = ColorKt.Color$default(103, 80, Constants.TAG_GPI_VERSION, 0, 8, null);
    private static final long Primary50 = ColorKt.Color$default(CertificateBody.profileType, 103, 190, 0, 8, null);
    private static final long Primary60 = ColorKt.Color$default(Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 130, Constants.TAG_KSL_ID, 0, 8, null);
    private static final long Primary70 = ColorKt.Color$default(182, 157, Constants.TAG_FULL_SVPP_IDENTIFICATION, 0, 8, null);
    private static final long Primary80 = ColorKt.Color$default(208, 188, 255, 0, 8, null);
    private static final long Primary90 = ColorKt.Color$default(Constants.TAG_EMV_ICC_CONFIG_VERSION, 221, 255, 0, 8, null);
    private static final long Primary95 = ColorKt.Color$default(246, Constants.TAG_MPOS_MODULE_STATE, 255, 0, 8, null);
    private static final long Primary99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, 254, 0, 8, null);
    private static final long Secondary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Secondary10 = ColorKt.Color$default(29, 25, 43, 0, 8, null);
    private static final long Secondary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Secondary20 = ColorKt.Color$default(51, 45, 65, 0, 8, null);
    private static final long Secondary30 = ColorKt.Color$default(74, 68, 88, 0, 8, null);
    private static final long Secondary40 = ColorKt.Color$default(98, 91, 113, 0, 8, null);
    private static final long Secondary50 = ColorKt.Color$default(122, 114, 137, 0, 8, null);
    private static final long Secondary60 = ColorKt.Color$default(149, ModuleDescriptor.MODULE_VERSION, Constants.TAG_EMVL3_VERSION, 0, 8, null);
    private static final long Secondary70 = ColorKt.Color$default(SyslogConstants.LOG_LOCAL6, 167, 192, 0, 8, null);
    private static final long Secondary80 = ColorKt.Color$default(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, 194, 220, 0, 8, null);
    private static final long Secondary90 = ColorKt.Color$default(232, 222, Constants.TAG_FULL_SVPP_IDENTIFICATION, 0, 8, null);
    private static final long Secondary95 = ColorKt.Color$default(246, Constants.TAG_MPOS_MODULE_STATE, 255, 0, 8, null);
    private static final long Secondary99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, 254, 0, 8, null);
    private static final long Tertiary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Tertiary10 = ColorKt.Color$default(49, 17, 29, 0, 8, null);
    private static final long Tertiary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Tertiary20 = ColorKt.Color$default(73, 37, 50, 0, 8, null);
    private static final long Tertiary30 = ColorKt.Color$default(99, 59, 72, 0, 8, null);
    private static final long Tertiary40 = ColorKt.Color$default(ISO781611.SMT_TAG, 82, 96, 0, 8, null);
    private static final long Tertiary50 = ColorKt.Color$default(SyslogConstants.LOG_LOCAL3, 105, LDSFile.EF_SOD_TAG, 0, 8, null);
    private static final long Tertiary60 = ColorKt.Color$default(181, ISO781611.CREATION_DATE_AND_TIME_TAG, 146, 0, 8, null);
    private static final long Tertiary70 = ColorKt.Color$default(Constants.TAG_SVPP_CHECKSUM, 157, 172, 0, 8, null);
    private static final long Tertiary80 = ColorKt.Color$default(239, SyslogConstants.LOG_LOCAL7, 200, 0, 8, null);
    private static final long Tertiary90 = ColorKt.Color$default(255, Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_E4_CUSTOMER_DATA, 0, 8, null);
    private static final long Tertiary95 = ColorKt.Color$default(255, Constants.TAG_OS_VERSION, Constants.TAG_TRANSACTION_DATA, 0, 8, null);
    private static final long Tertiary99 = ColorKt.Color$default(255, Constants.TAG_FB_CHARGING_STATUS, Constants.TAG_SUPPORTED_LOCALE_LIST, 0, 8, null);
    private static final long White = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    private PaletteTokens() {
    }

    /* JADX INFO: renamed from: getError10-0d7_KjU, reason: not valid java name */
    public final long m1504getError100d7_KjU() {
        return Error10;
    }

    /* JADX INFO: renamed from: getError100-0d7_KjU, reason: not valid java name */
    public final long m1505getError1000d7_KjU() {
        return Error100;
    }

    /* JADX INFO: renamed from: getError40-0d7_KjU, reason: not valid java name */
    public final long m1506getError400d7_KjU() {
        return Error40;
    }

    /* JADX INFO: renamed from: getError90-0d7_KjU, reason: not valid java name */
    public final long m1507getError900d7_KjU() {
        return Error90;
    }

    /* JADX INFO: renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m1508getNeutral00d7_KjU() {
        return Neutral0;
    }

    /* JADX INFO: renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m1509getNeutral100d7_KjU() {
        return Neutral10;
    }

    /* JADX INFO: renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m1510getNeutral1000d7_KjU() {
        return Neutral100;
    }

    /* JADX INFO: renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m1511getNeutral200d7_KjU() {
        return Neutral20;
    }

    /* JADX INFO: renamed from: getNeutral87-0d7_KjU, reason: not valid java name */
    public final long m1512getNeutral870d7_KjU() {
        return Neutral87;
    }

    /* JADX INFO: renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m1513getNeutral900d7_KjU() {
        return Neutral90;
    }

    /* JADX INFO: renamed from: getNeutral92-0d7_KjU, reason: not valid java name */
    public final long m1514getNeutral920d7_KjU() {
        return Neutral92;
    }

    /* JADX INFO: renamed from: getNeutral94-0d7_KjU, reason: not valid java name */
    public final long m1515getNeutral940d7_KjU() {
        return Neutral94;
    }

    /* JADX INFO: renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m1516getNeutral950d7_KjU() {
        return Neutral95;
    }

    /* JADX INFO: renamed from: getNeutral96-0d7_KjU, reason: not valid java name */
    public final long m1517getNeutral960d7_KjU() {
        return Neutral96;
    }

    /* JADX INFO: renamed from: getNeutral98-0d7_KjU, reason: not valid java name */
    public final long m1518getNeutral980d7_KjU() {
        return Neutral98;
    }

    /* JADX INFO: renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m1519getNeutralVariant300d7_KjU() {
        return NeutralVariant30;
    }

    /* JADX INFO: renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m1520getNeutralVariant500d7_KjU() {
        return NeutralVariant50;
    }

    /* JADX INFO: renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m1521getNeutralVariant800d7_KjU() {
        return NeutralVariant80;
    }

    /* JADX INFO: renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m1522getNeutralVariant900d7_KjU() {
        return NeutralVariant90;
    }

    /* JADX INFO: renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m1523getPrimary100d7_KjU() {
        return Primary10;
    }

    /* JADX INFO: renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m1524getPrimary1000d7_KjU() {
        return Primary100;
    }

    /* JADX INFO: renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m1525getPrimary300d7_KjU() {
        return Primary30;
    }

    /* JADX INFO: renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m1526getPrimary400d7_KjU() {
        return Primary40;
    }

    /* JADX INFO: renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m1527getPrimary800d7_KjU() {
        return Primary80;
    }

    /* JADX INFO: renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m1528getPrimary900d7_KjU() {
        return Primary90;
    }

    /* JADX INFO: renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m1529getSecondary100d7_KjU() {
        return Secondary10;
    }

    /* JADX INFO: renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m1530getSecondary1000d7_KjU() {
        return Secondary100;
    }

    /* JADX INFO: renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m1531getSecondary300d7_KjU() {
        return Secondary30;
    }

    /* JADX INFO: renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m1532getSecondary400d7_KjU() {
        return Secondary40;
    }

    /* JADX INFO: renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m1533getSecondary800d7_KjU() {
        return Secondary80;
    }

    /* JADX INFO: renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m1534getSecondary900d7_KjU() {
        return Secondary90;
    }

    /* JADX INFO: renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m1535getTertiary100d7_KjU() {
        return Tertiary10;
    }

    /* JADX INFO: renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m1536getTertiary1000d7_KjU() {
        return Tertiary100;
    }

    /* JADX INFO: renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m1537getTertiary300d7_KjU() {
        return Tertiary30;
    }

    /* JADX INFO: renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m1538getTertiary400d7_KjU() {
        return Tertiary40;
    }

    /* JADX INFO: renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m1539getTertiary800d7_KjU() {
        return Tertiary80;
    }

    /* JADX INFO: renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m1540getTertiary900d7_KjU() {
        return Tertiary90;
    }
}
