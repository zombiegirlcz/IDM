package rj;

import com.ironz.binaryprefs.exception.LockOperationException;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Lock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f254598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f254599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileChannel f254600c;
    public FileLock d;

    public a(File file) {
        this.f254598a = file;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f254598a, "rwd");
            this.f254599b = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f254600c = channel;
            this.d = channel.lock();
        } catch (Exception e) {
            try {
                RandomAccessFile randomAccessFile2 = this.f254599b;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                FileChannel fileChannel = this.f254600c;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (Exception unused) {
            }
            throw new LockOperationException(e);
        }
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
        try {
            try {
                FileLock fileLock = this.d;
                if (fileLock != null && fileLock.isValid()) {
                    this.d.release();
                }
            } finally {
                try {
                    RandomAccessFile randomAccessFile = this.f254599b;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    FileChannel fileChannel = this.f254600c;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            throw new LockOperationException(e);
        }
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
