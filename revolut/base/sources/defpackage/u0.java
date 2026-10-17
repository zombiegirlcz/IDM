package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.ServiceState;
import com.youTransactor.uCube.rpc.command.InstallForLoadCommand;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import mzj.j;

/* JADX INFO: loaded from: classes21.dex */
public final class u0 extends l {
    public List I;
    public byte[] J;
    public LinkedList K;
    public Timer L;
    public boolean M;

    public static void c(LinkedList linkedList, List list, final int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = (List) list.stream().filter(new Predicate() { // from class: s0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj2) {
                return ((BinaryUpdate) obj2).getCfg().getType() == i;
            }
        }).collect(Collectors.toList());
        linkedList.addAll(list2);
        list.removeAll(list2);
    }

    @Override // defpackage.l
    public final void a() {
        List list = this.I;
        if (list == null || list.isEmpty()) {
            notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
        } else {
            b(ServiceState.RETRIEVE_DEVICE_CERTIFICAT, new Object[0]);
            new o1().execute(new j(this, 22));
        }
    }

    public final void d() {
        if (this.K.isEmpty()) {
            notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
            return;
        }
        BinaryUpdate binaryUpdate = (BinaryUpdate) this.K.poll();
        v1.a("install " + binaryUpdate.getCfg().getLabel() + " is ciphered :" + binaryUpdate.getCfg().isCiphered());
        b(ServiceState.UPDATE_DEVICE, binaryUpdate.getCfg(), Integer.valueOf(this.K.size()));
        InstallForLoadCommand installForLoadCommand = new InstallForLoadCommand();
        installForLoadCommand.setSignature(binaryUpdate.getSignature());
        if (binaryUpdate.getCfg().isCiphered()) {
            installForLoadCommand.setEncryptionMethod((byte) 1);
            installForLoadCommand.setCipheredKey(binaryUpdate.getKey());
        } else {
            installForLoadCommand.setEncryptionMethod((byte) 2);
        }
        installForLoadCommand.execute(new d0(this, installForLoadCommand, binaryUpdate));
    }
}
